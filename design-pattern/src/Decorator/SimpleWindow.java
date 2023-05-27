package Decorator;

public class SimpleWindow implements Window {

    @Override
    public void draw() {
        System.out.println("draw simple");
    }

    @Override
    public String getDescription() {
        return "simple";
    }
}
