package org.example.model;

import java.util.Random;

//based on: https://www.baeldung.com/java-skiplist
public class SkipList {
    private SkipListNode head;
    private final int maxLevel;
    private final Random random;

    public SkipList() {
        this.maxLevel = 8;
        this.head = new SkipListNode(0, maxLevel);
        this.random = new Random();
    }

    public void insert(int value) {
        SkipListNode[] update = new SkipListNode[maxLevel + 1];
        SkipListNode current = this.head;

        //if smaller than head - insert in front of it
        if (value <= head.value) {
            SkipListNode newNode = new SkipListNode(value, maxLevel);
            for (int i = maxLevel; i >= 0; i--) {
                newNode.forward[i] = head;
            }
            this.head = newNode;
        } else {

            //if there is only one element - auto add current element to the back and skip rest of the logic
            if (current.forward[0] == null) {
                for (int i = maxLevel; i >= 0; i--) {
                    current.forward[i] = new SkipListNode(value, i);
                }
            } else {
                for (int i = maxLevel; i >= 0; i--) {
                    current = seekAndStopBeforeTarget(current, value, i);
                    update[i] = current;
                }

                current = current.forward[0];

                if (current == null || current.value != value) {
                    final int lvl = getRandomLevel();

                    //to each of closest smaller items on each level replace next node link
                    SkipListNode newNode = new SkipListNode(value, lvl);
                    for (int i = 0; i <= lvl; i++) {
                        newNode.forward[i] = update[i].forward[i];
                        update[i].forward[i] = newNode;
                    }
                }
            }
        }
    }

    public boolean search(int value) {
        SkipListNode current = this.head;

        if (this.head.value > value) {
            return false;
        }

        if (this.head.value == value) {
            return true;
        }

        //find and stop before desired value
        for (int i = maxLevel; i >= 0; i--) {
            current = seekAndStopBeforeTarget(current, value, i);
        }
        //take desired value
        current = current.forward[0];
        return current != null && current.value == value;
    }

    public void delete(int value) {
        SkipListNode[] update = new SkipListNode[maxLevel + 1];
        SkipListNode current = this.head;

        if (this.head.value > value) {
            return;
        }

        if (this.head.value == value) {
            this.head = head.forward[0];
            return;
        }

        for (int i = maxLevel; i >= 0; i--) {
            current = seekAndStopBeforeTarget(current, value, i);
            update[i] = current;
        }
        current = current.forward[0];

        if (current != null && current.value == value) {
            for (int i = 0; i <= maxLevel; i++) {
                if (update[i].forward[i] != current) break;
                update[i].forward[i] = current.forward[i];
            }
        }
    }

    private SkipListNode seekAndStopBeforeTarget(SkipListNode current, int value, int i) {
        while (current.forward[i] != null && current.forward[i].value < value) {
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
