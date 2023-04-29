package Builder;

public class CarBuilder {
    private String name;
    private String type;

    public CarBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CarBuilder type(String type) {
        this.type = type;
        return this;
    }

    public Car Build() {
        return new Car(name, type);
    }
}
