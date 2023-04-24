package Facade;

import java.util.HashMap;

public class DBMS {
    private HashMap<String, Row> DB = new HashMap<>();
    public DBMS() {
        DB.put("song1", new Row("song1", "1999-01-01", "song@test1.com"));
        DB.put("song2", new Row("song2", "1999-02-01", "song@test2.com"));
        DB.put("song3", new Row("song3", "1999-03-01", "song@test3.com"));
    }

    public HashMap<String, Row> getRow() {
        return DB;
    }

}
