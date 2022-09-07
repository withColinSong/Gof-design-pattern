package Strategy;

public class MainEntry {
    public static void main(String[] args) {

        SumPrinter printer = new SumPrinter();
        printer.print(new SimpleSumStrategy(), 2);

    }
}
