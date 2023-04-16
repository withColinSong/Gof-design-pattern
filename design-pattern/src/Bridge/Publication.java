package Bridge;

public class Publication extends Draft {
    private String publisher;
    private int cost;

    public Publication(String title, String author, String[] content, String publisher, int cost) {
        super(title, author, content);
        this.publisher = publisher;
        this.cost = cost;
    }

    public void printInfo() {
        System.out.println(this.publisher);
        System.out.println(this.cost);
    }

    @Override
    public void print(Display display) {
        super.print(display);
        printInfo();
    }
}
