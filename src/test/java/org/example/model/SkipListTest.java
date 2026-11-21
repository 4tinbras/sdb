package org.example.model;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SkipListTest {

    private final static int MAX_LEVEL = 8;

    @Test
    void whenInsertValueBetweenMinMax_andLaterRemove_thenAdd_and_ThenRemove() {
        SkipList skipList = new SkipList(new SkipListNode(0, MAX_LEVEL, Instant.now().toEpochMilli()), MAX_LEVEL);
        skipList.insert(5);
        skipList.insert(11);
        skipList.insert(7);
        skipList.insert(2);

        assertTrue(skipList.search(5));
        assertTrue(skipList.search(11));
        assertTrue(skipList.search(7));
        assertTrue(skipList.search(2));
        assertTrue(skipList.search(0));

        assertFalse(skipList.delete(23));
        assertTrue(skipList.delete(5));

        assertFalse(skipList.search(5));
        assertFalse(skipList.delete(5));
    }

    @Test
    void whenInsertSmallerThanHead_andRemoveLater_thenFindAtFirst_andNotFindAtSecondTime() {
        SkipList skipList = new SkipList(new SkipListNode(0, MAX_LEVEL, Instant.now().toEpochMilli()), MAX_LEVEL);
        skipList.insert(-1);

        assertTrue(skipList.search(-1));

        skipList.delete(-1);

        assertFalse(skipList.search(-1));
    }
}