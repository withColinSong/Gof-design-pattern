package Bridge;

public class MainEntry {
    public static void main(String[] args) {


        String title = "자바의 정석";
        String author = "남궁성";
        String[] content = {
                "Stream",
                "Variable",
        };

        Draft draft = new Draft(title, author, content);

        Display simpleDisplay = new SimpleDisplay();
        draft.print(simpleDisplay);

        int cost = 20000;
        String publisher = "도우출판";

        Draft publication = new Publication(title, author, content, publisher, cost);

        Display simpleDisplay2 = new SimpleDisplay();
        publication.print(simpleDisplay2);




    }
}
