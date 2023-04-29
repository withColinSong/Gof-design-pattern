package Builder;

import java.util.Locale;

public class Car {
    public Car(String name, String type) {
        this.name = name;
        this.type = type;
    }

    private String name;
    private String type;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

}
