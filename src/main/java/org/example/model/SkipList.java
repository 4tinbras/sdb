package org.example.model;

import java.time.Instant;
import java.util.Random;

//based on: https://www.baeldung.com/java-skiplist

/**
 * Implementation of skip list that does not allow repetitions of keys.
 *
 * @param <K> type of keys of key-value pair
 * @param <V> type of value of key-value pair
 */
public class SkipList<K extends Comparable<? super K>, V> {
    private SkipListNode<K, V> head;
    private final int maxLevel;
    private final Random random;

    public SkipList(final SkipListNode<K, V> headNode, final int maxLevel) {
        this.maxLevel = maxLevel;
        this.head = headNode;
        this.random = new Random();
    }

    //TODO: add convenience fields/methods like length

    public void insert(K key, V value) {


        //if smaller than head - insert in front of it
        if (key.compareTo(head.key) <= 0) {
            SkipListNode<K, V> newNode = new SkipListNode<K, V>(key, value, maxLevel, Instant.now().toEpochMilli());
            for (int i = maxLevel; i >= 0; i--) {
                newNode.forward[i] = head;
            }
            this.head = newNode;
            //in theory there is an exploit here that would allow polluting memory by inserting new nodes one in front of the other
            //but dropping links in former head would be messy, so it's an accepted risk
            return;
        }


        //if there is only one element - auto add current element to the back and skip rest of the logic
        if (head.forward[0] == null) {
            SkipListNode<K, V> newTerminalNode = new SkipListNode<K, V>(key, value, maxLevel, Instant.now().toEpochMilli());
            for (int i = maxLevel; i >= 0; i--) {
                head.forward[i] = newTerminalNode;
            }

            return;
        }

        SkipListNode<K, V>[] update = new SkipListNode[maxLevel + 1];
        SkipListNode<K, V> current = this.head;

        for (int i = maxLevel; i >= 0; i--) {
            current = seekAndStopBeforeTarget(current, key, i);
            update[i] = current;
        }

        current = current.forward[0];

        if (current == null || current.key != key) {
            final int lvl = getRandomLevel();

            //to each of closest smaller items on each level replace next node link
            SkipListNode<K, V> newNode = new SkipListNode<K, V>(key, value, lvl, Instant.now().toEpochMilli());
            for (int i = 0; i <= lvl; i++) {
                newNode.forward[i] = update[i].forward[i];
                update[i].forward[i] = newNode;
            }
        }


    }

    /**
     * @param key - used to query key set
     * @return - In case of matching key - returns associated node. In case of no matching key returns null.
     */
    public SkipListNode<K, V> search(K key) {

        if (this.head.key.compareTo(key) > 0) {
            return null;
        }

        if (this.head.key.compareTo(key) == 0) {
            return this.head;
        }

        SkipListNode<K, V> current = this.head;

        for (int i = maxLevel; i >= 0; i--) {
            current = seekAndStopBeforeTarget(current, key, i);
        }
        current = current.forward[0];

        if (current == null || current.key != key) {
            return null;
        }

        return current;
    }

    public boolean delete(K key) {

        if (this.head.key.compareTo(key) > 0) {
            return false;
        }

        if (this.head.key.compareTo(key) == 0) {
            this.head = head.forward[0];
            return true;
        }

        SkipListNode<K, V> current = this.head;
        SkipListNode<K, V>[] update = new SkipListNode[maxLevel + 1];

        for (int i = maxLevel; i >= 0; i--) {
            current = seekAndStopBeforeTarget(current, key, i);
            update[i] = current;
        }
        current = current.forward[0];

        if (current != null && current.key.compareTo(key) == 0) {
            for (int i = 0; i <= maxLevel; i++) {
                if (update[i].forward[i] != current) break;
                update[i].forward[i] = current.forward[i];
            }
            return true;
        }
        return false;
    }

    private SkipListNode<K, V> seekAndStopBeforeTarget(SkipListNode<K, V> current, K key, int i) {
        while (current.forward[i] != null && current.forward[i].key.compareTo(key) < 0) {
            current = current.forward[i];
        }

        return current;
    }

    private int getRandomLevel() {
        int doesContinue = 1;
        int counter = -1; //in order to start with 0
        while (doesContinue > 0 && counter <= maxLevel) {
            counter++;
            doesContinue = random.nextInt(2);
        }
        return counter;
    }
}
