package Flyweight;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainEntry {
    public static void main(String[] args) throws FileNotFoundException {
        Number number = new Number(4331);
        number.print(5, 5);

        System.out.println();
        System.out.println();
        System.out.println();

    }
}
