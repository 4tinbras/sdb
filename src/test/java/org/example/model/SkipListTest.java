package org.example.model;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SkipListTest {

    private final static int MAX_LEVEL = 8;

    @Test
    void whenInsertValueBetweenMinMax_andLaterRemove_thenAdd_and_ThenRemove() {
        SkipList<Integer> skipList = new SkipList<Integer>(
                new SkipListNode<Integer>(0, MAX_LEVEL, Instant.now().toEpochMilli()), MAX_LEVEL);
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
    void whenDuplicatesAttemptInsertion_thenPreventDuplicates() {
        SkipList<Integer> skipList = new SkipList<Integer>(
                new SkipListNode<Integer>(0, MAX_LEVEL, Instant.now().toEpochMilli()), MAX_LEVEL);
        skipList.insert(11);
        skipList.insert(7);
        skipList.insert(2);
        skipList.insert(2);

        assertTrue(skipList.search(2));

        skipList.delete(2);
        assertFalse(skipList.search(2));
    }

    @Test
    void whenInsertSmallerThanHead_andRemoveLater_thenFindAtFirst_andNotFindAtSecondTime() {
        SkipList<Integer> skipList = new SkipList<Integer>(new SkipListNode<Integer>(0, MAX_LEVEL, Instant.now().toEpochMilli()), MAX_LEVEL);
        skipList.insert(-1);

        assertTrue(skipList.search(-1));

        skipList.delete(-1);

        assertFalse(skipList.search(-1));
    }

    @Test
    void givenDateItems_whenInsertSearchAndDelete_thenCorrectlyAddsFindsAndDeletes() {
        Instant beforeInitialHead = Instant.ofEpochMilli(111_111L);
        Instant initialHead = Instant.ofEpochMilli(222_222L);
        Instant afterInitialHead = Instant.ofEpochMilli(33_33L);

        ZonedDateTime beforeInitialHeadZdt = ZonedDateTime.ofInstant(beforeInitialHead, ZoneId.systemDefault());
        ZonedDateTime initialHeadZdt = ZonedDateTime.ofInstant(initialHead, ZoneId.systemDefault());
        ZonedDateTime afterInitialHeadZdt = ZonedDateTime.ofInstant(afterInitialHead, ZoneId.systemDefault());

        SkipList<ZonedDateTime> skipList = new SkipList<ZonedDateTime>(
                new SkipListNode<ZonedDateTime>(initialHeadZdt, MAX_LEVEL, Instant.now().toEpochMilli()), MAX_LEVEL);

        skipList.insert(afterInitialHeadZdt);
        skipList.insert(beforeInitialHeadZdt);

        assertTrue(skipList.search(beforeInitialHeadZdt));
        assertTrue(skipList.search(initialHeadZdt));
        assertTrue(skipList.search(afterInitialHeadZdt));

        assertTrue(skipList.delete(afterInitialHeadZdt));
        assertFalse(skipList.search(afterInitialHeadZdt));
    }
}