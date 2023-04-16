package Bridge;

public class SimpleDisplay implements Display {

    @Override
    public void title(Draft draft) {
        System.out.println(draft.getTitle());
    }

    @Override
    public void author(Draft draft) {
        System.out.println(draft.getAuthor());
    }

    @Override
    public void content(Draft draft) {
        for (int i = 0; i < draft.getContent().length; i++) {
            System.out.println(draft.getContent()[i]);
        }
    }
}
