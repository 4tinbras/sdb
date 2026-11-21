package org.example.model;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Random;

//based on: https://www.baeldung.com/java-skiplist
public class SkipList <T extends Comparable<? super T>> {
    private SkipListNode<T> head;
    private final int maxLevel;
    private final Random random;

    public SkipList(final SkipListNode<T> headNode, final int maxLevel) {
        this.maxLevel = maxLevel;
        this.head = headNode;
        this.random = new Random();
    }

    //TODO: add convenience fields/methods like length

    public void insert(T value) {


        //if smaller than head - insert in front of it
        if (value.compareTo(head.value) <= 0) {
            SkipListNode<T> newNode = new SkipListNode<T>(value, maxLevel, Instant.now().toEpochMilli());
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
            SkipListNode<T> newTerminalNode = new SkipListNode<T>(value, maxLevel, Instant.now().toEpochMilli());
            for (int i = maxLevel; i >= 0; i--) {
                head.forward[i] = newTerminalNode;
            }

            return;
        }

        SkipListNode<T>[] update = new SkipListNode[maxLevel + 1];
        SkipListNode<T> current = this.head;

        for (int i = maxLevel; i >= 0; i--) {
            current = seekAndStopBeforeTarget(current, value, i);
            update[i] = current;
        }

        current = current.forward[0];

        if (current == null || current.value != value) {
            final int lvl = getRandomLevel();

            //to each of closest smaller items on each level replace next node link
            SkipListNode<T> newNode = new SkipListNode<T>(value, lvl, Instant.now().toEpochMilli());
            for (int i = 0; i <= lvl; i++) {
                newNode.forward[i] = update[i].forward[i];
                update[i].forward[i] = newNode;
            }
        }


    }

    public boolean search(T value) {

        if (this.head.value.compareTo(value) > 0) {
            return false;
        }

        if (this.head.value.compareTo(value) == 0) {
            return true;
        }

        SkipListNode<T> current = this.head;

        for (int i = maxLevel; i >= 0; i--) {
            current = seekAndStopBeforeTarget(current, value, i);
        }
        current = current.forward[0];
        return current != null && current.value == value;
    }

    public boolean delete(T value) {

        if (this.head.value.compareTo(value) > 0) {
            return false;
        }

        if (this.head.value.compareTo(value) == 0) {
            this.head = head.forward[0];
            return true;
        }

        SkipListNode<T> current = this.head;
        SkipListNode<T>[] update = new SkipListNode[maxLevel + 1];

        for (int i = maxLevel; i >= 0; i--) {
            current = seekAndStopBeforeTarget(current, value, i);
            update[i] = current;
        }
        current = current.forward[0];

        if (current != null && current.value.compareTo(value) == 0) {
            for (int i = 0; i <= maxLevel; i++) {
                if (update[i].forward[i] != current) break;
                update[i].forward[i] = current.forward[i];
            }
            return true;
        }
        return false;
    }

    private SkipListNode<T> seekAndStopBeforeTarget(SkipListNode<T> current, T value, int i) {
        while (current.forward[i] != null && current.forward[i].value.compareTo(value) < 0) {
            current = current.forward[i];
        }

        return current;
    }

    private int getRandomLevel() {
        int doesContinue = 1;
        int counter = -1; //in order to start with 0
        while(doesContinue > 0) {
            counter++;
            doesContinue = random.nextInt(2);
        }
        return counter;
    }
}
