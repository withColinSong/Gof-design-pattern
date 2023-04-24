package Facade;

import java.util.HashMap;

public class Cache {
    private HashMap<String, Row> cache = new HashMap<>();
    public Row get(String key) {
        return cache.get(key);
    }

    public void put(Row row) {
        cache.put(row.getName(), row);
    }

}
