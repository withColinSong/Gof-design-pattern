package Proxy;

public class MainEntry {
    public static void main(String[] args) {

        Display screenDisplay = new ScreenDisplay();
        Display bufferDisplay = new BufferDisplay(3);

        bufferDisplay.print("hello1");
        bufferDisplay.print("hello2");
        bufferDisplay.print("hello3");
        bufferDisplay.print("hello4");
        bufferDisplay.print("hello5");

        ((BufferDisplay) bufferDisplay).flush();

    }
}
