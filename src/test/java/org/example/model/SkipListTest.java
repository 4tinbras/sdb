package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SkipListTest {

    @Test
    void whenInsertValueBetweenMinMax_whenInsert_thenAddNodeWithRandomLevelTower() {
        SkipList skipList = new SkipList();
        skipList.insert(5);
        skipList.insert(11);
        skipList.insert(7);
        skipList.insert(2);
//        skipList.insert(-1);

        assertTrue(skipList.search(5));
        assertTrue(skipList.search(11));
        assertTrue(skipList.search(7));
        assertTrue(skipList.search(2));
//        assertTrue(skipList.search(-1));
    }
}