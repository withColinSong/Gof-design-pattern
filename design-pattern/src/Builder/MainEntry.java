package Builder;

public class MainEntry {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .name("kespa")
                .type("small")
                .Build();

        System.out.println(car.toString());

        CarBuilder builder = new CarBuilder()
                .name("k3");

        Car car2 = builder
                .type("middle")
                .Build();

        System.out.println(car2.toString());

    }
}
