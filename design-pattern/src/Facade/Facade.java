package Facade;

import java.util.Objects;

public class Facade {
    private Cache cache = new Cache();
    private DBMS dbms = new DBMS();


    public void run(String name) {
        Row row = cache.get(name);
        if(Objects.isNull(row)) {
            Row data = dbms.getRow().get(name);
            cache.put(data);
        } else {
            cache.get(name);
        }

        Message message = new Message(cache.get(name));
        message.print();
    }
}
