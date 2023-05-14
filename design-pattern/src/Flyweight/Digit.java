package Flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Digit {
    private ArrayList<String> data = new ArrayList<>();

    public Digit(String fileName) {

        try (
                FileReader fr = new FileReader(fileName);
                BufferedReader br = new BufferedReader(fr);
        ) {

//            while ((tmp = br.readLine()) != null) {
//                data.add(tmp);
//            }

            for (int i = 0; i < 4; i++) {
                data.add(br.readLine());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void print(int x, int y) {
        for (int i = 0; i < 4; i++) {
            String line = data.get(i);
            System.out.printf("%C[%d;%df", 0x1B, y + i, x);
            System.out.println(line);
        }
    }
}
