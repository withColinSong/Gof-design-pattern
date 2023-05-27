package Composite;

public class MainEntry {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        root.add(new File("a.txt", 1000));
        root.add(new File("b.txt", 2000));

        Folder sub1 = new Folder("sub1");
        root.add(sub1);
        sub1.add(new File("a.txt", 100));
        sub1.add(new File("b.txt", 400));

        System.out.println(root.getSize());

    }
}
