package org.example.model;

import org.w3c.dom.Node;

public class SkipListNode <N extends Comparable<? super N>>{
    final N value;
    SkipListNode<N>[] forward;
    long insertionTimestamp;

    public SkipListNode(N value, int level, long insertionTimestamp) {
        this.value = value;
        this.forward = new SkipListNode[level + 1];
        this.insertionTimestamp = insertionTimestamp;
    }
}
