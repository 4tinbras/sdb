package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.nio.file.Path;

@AllArgsConstructor
@Getter
public class KeyValueTable<K extends Comparable<? super K>, V> implements AutoCloseable {

    private SkipList<K, V> cacheTable;
    private AppendOnlyLog appendOnlyLog;
    private Path mainFilePath;

    public DataRecord getRecord(K comparisonKey) {
        SkipListNode<K, V> value = cacheTable.search(comparisonKey);
        if (value != null) {
            return new DataRecord(value.key, value.value, value.insertionTimestamp);
        }

        return null;
    }

    @Override
    public void close() throws Exception {
        appendOnlyLog.close();
    }

    @Getter
    @AllArgsConstructor
    public class DataRecord {
        K key;
        V value;
        long timestamp;
    }
}
