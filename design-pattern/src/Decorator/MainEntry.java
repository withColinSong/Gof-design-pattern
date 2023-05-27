package Decorator;

public class MainEntry {
    public static void main(String[] args) {

        Window decoratedWindow1 = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));
        Window decoratedWindow2 = new VerticalScrollBarDecorator(new SimpleWindow());
        Window decoratedWindow3 = new SimpleWindow();

        System.out.println(decoratedWindow1.getDescription());
        System.out.println(decoratedWindow2.getDescription());
        System.out.println(decoratedWindow3.getDescription());

    }
}
