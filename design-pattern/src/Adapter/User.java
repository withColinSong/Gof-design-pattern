package Adapter;

import java.util.ArrayList;

public class User {
    public static void main(String[] args) {

        ArrayList<Animal> animal = new ArrayList<>();

        animal.add(new Cat("야옹이"));
        animal.add(new Dog("바둑이"));
        animal.add(new TigerAdapter("호랭이"));

        animal.forEach(Animal::sound);


    }
}
