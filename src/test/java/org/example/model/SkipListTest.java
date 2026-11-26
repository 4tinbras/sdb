package org.example.model;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

class SkipListTest {

    private final static int MAX_LEVEL = 8;

    @Test
    void whenInsertValueBetweenMinMax_andLaterRemove_thenAdd_and_ThenRemove() {
        SkipList<Integer, Integer> skipList = new SkipList<Integer, Integer>(
                new SkipListNode<Integer, Integer>(0, 0, MAX_LEVEL, Instant.now().toEpochMilli()), MAX_LEVEL);
        skipList.insert(5, 5);
        skipList.insert(11, 11);
        skipList.insert(7, 7);
        skipList.insert(2, 2);

        assertEquals(5, skipList.search(5).value);
        assertEquals(11, skipList.search(11).value);
        assertEquals(7, skipList.search(7).value);
        assertEquals(2, skipList.search(2).value);
        assertEquals(0, skipList.search(0).value);

        assertFalse(skipList.delete(23));
        assertTrue(skipList.delete(5));

        assertEquals(null, skipList.search(5));
        assertFalse(skipList.delete(5));
    }

    @Test
    void whenUsingDifferentTypes_thenCorrectlyMapValues() {
        SkipList<Integer, String> skipList = new SkipList<Integer, String>(
                new SkipListNode<Integer, String>(0, "Fruits", MAX_LEVEL, Instant.now().toEpochMilli()), MAX_LEVEL);
        skipList.insert(11, "Pears");
        skipList.insert(7, "Oranges");
        skipList.insert(5, "Apples");

        assertEquals("Apples", skipList.search(5).value);
        assertEquals("Pears", skipList.search(11).value);
        assertEquals("Oranges", skipList.search(7).value);

        assertFalse(skipList.delete(23));
        assertTrue(skipList.delete(5));

        assertEquals(null, skipList.search(5));
        assertFalse(skipList.delete(5));
    }

    @Test
    void whenDuplicatesAttemptInsertion_thenPreventDuplicates() {
        SkipList<Integer, Integer> skipList = new SkipList<Integer, Integer>(
                new SkipListNode<Integer, Integer>(0, 0, MAX_LEVEL, Instant.now().toEpochMilli()), MAX_LEVEL);
        skipList.insert(11, 11);
        skipList.insert(7, 7);
        skipList.insert(2, 2);
        skipList.insert(2, 2);

        assertEquals(2, skipList.search(2).value);

        skipList.delete(2);
        assertEquals(null, skipList.search(2));
    }

    @Test
    void whenInsertSmallerThanHead_andRemoveLater_thenFindAtFirst_andNotFindAtSecondTime() {
        SkipList<Integer, Integer> skipList = new SkipList<Integer, Integer>(new SkipListNode<Integer, Integer>(0, 0, MAX_LEVEL, Instant.now().toEpochMilli()), MAX_LEVEL);
        skipList.insert(-1, -1);

        assertEquals(-1, skipList.search(-1).value);

        skipList.delete(-1);

        assertEquals(null, skipList.search(-1));
    }

    @Test
    void givenDateItems_whenInsertSearchAndDelete_thenCorrectlyAddsFindsAndDeletes() {
        Instant beforeInitialHead = Instant.ofEpochMilli(111_111L);
        Instant initialHead = Instant.ofEpochMilli(222_222L);
        Instant afterInitialHead = Instant.ofEpochMilli(33_33L);

        ZonedDateTime beforeInitialHeadZdt = ZonedDateTime.ofInstant(beforeInitialHead, ZoneId.systemDefault());
        ZonedDateTime initialHeadZdt = ZonedDateTime.ofInstant(initialHead, ZoneId.systemDefault());
        ZonedDateTime afterInitialHeadZdt = ZonedDateTime.ofInstant(afterInitialHead, ZoneId.systemDefault());

        SkipList<ZonedDateTime, ZonedDateTime> skipList = new SkipList<ZonedDateTime, ZonedDateTime>(
                new SkipListNode<ZonedDateTime, ZonedDateTime>(initialHeadZdt, initialHeadZdt, MAX_LEVEL, Instant.now().toEpochMilli()), MAX_LEVEL);

        skipList.insert(afterInitialHeadZdt, afterInitialHeadZdt);
        skipList.insert(beforeInitialHeadZdt, beforeInitialHeadZdt);

        assertEquals(beforeInitialHeadZdt, skipList.search(beforeInitialHeadZdt).value);
        assertEquals(initialHeadZdt, skipList.search(initialHeadZdt).value);
        assertEquals(afterInitialHeadZdt, skipList.search(afterInitialHeadZdt).value);

        assertTrue(skipList.delete(afterInitialHeadZdt));
        assertEquals(null, skipList.search(afterInitialHeadZdt));
    }
}