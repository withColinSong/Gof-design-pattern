package Proxy;

import java.util.ArrayList;

public class BufferDisplay implements Display {

    private final ArrayList<String> buffer = new ArrayList<>();
    private ScreenDisplay screenDisplay;
    private final int bufferSize;

    public BufferDisplay(int bufferSize) {
        this.bufferSize = bufferSize;
    }

    @Override
    public void print(String content) {
        buffer.add(content);
        if(bufferSize == buffer.size()) {
            flush();
        }
    }

    public void flush() {
        if(screenDisplay == null) screenDisplay = new ScreenDisplay();
        String lines = String.join("\n", buffer);
        screenDisplay.print(lines);
        buffer.clear();
    }
}
