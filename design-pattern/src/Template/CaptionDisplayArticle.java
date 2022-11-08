package Template;

import java.util.ArrayList;

public class CaptionDisplayArticle extends DisplayArticleTemplate {
    public CaptionDisplayArticle(Article article) {
        super(article);
    }

    @Override
    protected void title() {
        System.out.println("[TITLE]" + article.getTitle());
    }

    @Override
    protected void content() {
        ArrayList<String> content = article.getContent();
        content.stream()
                .forEach(x-> {
                    System.out.println("[CONTENT]" + x);
                });
    }

    @Override
    protected void footer() {
        System.out.println("[FOOTER]" +article.getFooter());
    }
}
