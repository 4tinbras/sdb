package org.example.model;

import org.w3c.dom.Node;

public class SkipListNode {
    final int value;
    SkipListNode[] forward;
    long insertionTimestamp;

    public SkipListNode(int value, int level, long insertionTimestamp) {
        this.value = value;
        this.forward = new SkipListNode[level + 1];
        this.insertionTimestamp = insertionTimestamp;
    }
}
