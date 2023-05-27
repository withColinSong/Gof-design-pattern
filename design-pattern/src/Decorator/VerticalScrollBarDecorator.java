package Decorator;

public class VerticalScrollBarDecorator extends WindowDecorator {

    public VerticalScrollBarDecorator(Window decoratedWindow) {
        super(decoratedWindow);
    }

    public void draw() {
        drawVerticalScrollBar();
        decoratedWindow.draw();
    }

    private void drawVerticalScrollBar() {
        System.out.println("draw the vertical scrollbar");
    }

    public String getDescription() {
        return decoratedWindow.getDescription() + ", including vertical scrollbars";
    }
}
