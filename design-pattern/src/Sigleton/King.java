package Sigleton;

public class King {
    private King() {}

    private static King self = null;

    // 멀티 쓰레드일 때 지정
    public synchronized static King getInstance() {
        if(self == null) {
            self = new King();
        }

        return self;
    }

    public void say() {
        System.out.println("I am one");
    }
}
