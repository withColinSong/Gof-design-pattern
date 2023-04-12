package Adapter;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Animal - "+ this.getName());
        System.out.println("Sound  - 애옹");
    }
}
