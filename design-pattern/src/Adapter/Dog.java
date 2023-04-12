package Adapter;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Animal - " + this.getName());
        System.out.println("Sound  - 월월");
    }
}
