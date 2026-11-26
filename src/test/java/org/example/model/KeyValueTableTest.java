package org.example.model;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;

class KeyValueTableTest {


    @Test
    void givenRecordIsInMemTable_whenGetRecord_returnRecordFromMemTable() {
        SkipList<Integer, String> skipList = Mockito.mock(SkipList.class);
        SkipListNode<Integer, String> result = new SkipListNode<>(11, "bananas", 0, 10101L);
        Mockito.when(skipList.search(eq(11))).thenReturn(result);

        KeyValueTable<Integer, String> subject = new KeyValueTable(skipList, null, null);

        assertEquals(result.key, subject.getRecord(11).key);
        assertEquals(result.value, subject.getRecord(11).value);
        assertEquals(result.insertionTimestamp, subject.getRecord(11).timestamp);
    }

    @Test
    void givenRecordIsNotInMemTable_whenGetRecord_returnNull() {
        SkipList<Integer, String> skipList = Mockito.mock(SkipList.class);
        Mockito.when(skipList.search(eq(11))).thenReturn(null);

        KeyValueTable<Integer, String> subject = new KeyValueTable(skipList, null, null);

        assertEquals(null, subject.getRecord(11));
    }

}