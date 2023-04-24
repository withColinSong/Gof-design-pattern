package Facade;

import java.util.HashMap;
import java.util.Objects;

public class MainEntry {
    public static void main(String[] args) {

        // [AS-IS]
//        Cache cache = new Cache();
//        DBMS dbms = new DBMS();

//        String key = "song1";

//        Row row = cache.get(key);
//        if(Objects.isNull(row)) {
//            Row data = dbms.getRow().get(key);
//            cache.put(data);
//        } else {
//            cache.get(key);
//        }
//
//        Message message = new Message(cache.get(key));
//        message.print();

        // [TO-BE]
        String key = "song1";
        Facade facade = new Facade();
        facade.run(key);
    }
}
