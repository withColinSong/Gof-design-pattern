package Sigleton;

public class MainEntry {
    public static void main(String[] args) {
        King king1 = King.getInstance();
        king1.say();
        King king2 = King.getInstance();

        if(king1.equals(king2)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

    }
}
