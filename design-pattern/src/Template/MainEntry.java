package Template;

import java.util.ArrayList;

public class MainEntry {
    public static void main(String[] args) {

        String title = "제목입니다.";
        ArrayList<String> contents = new ArrayList<>();
        contents.add("content1");
        contents.add("content2");
        contents.add("content3");
        String footer = "2022.11.08 song";

        Article article = new Article(title, contents, footer);

        SimpleDisplayArticle simpleDisplayArticle = new SimpleDisplayArticle(article);
        simpleDisplayArticle.title();
        simpleDisplayArticle.content();
        simpleDisplayArticle.footer();

        CaptionDisplayArticle captionDisplayArticle = new CaptionDisplayArticle(article);
        captionDisplayArticle.title();
        captionDisplayArticle.content();
        captionDisplayArticle.footer();


    }
}
