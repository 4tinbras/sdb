package org.example.model;


public class SkipListNode<K extends Comparable<? super K>, V> {
    final K key;
    final V value;
    SkipListNode<K, V>[] forward;
    final long insertionTimestamp;

    public SkipListNode(K key, V value, int level, long insertionTimestamp) {
        this.key = key;
        this.value = value;
        this.forward = new SkipListNode[level + 1];
        this.insertionTimestamp = insertionTimestamp;
    }
}