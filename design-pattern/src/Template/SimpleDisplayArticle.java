package Template;

import java.util.ArrayList;

public class SimpleDisplayArticle extends DisplayArticleTemplate {

    public SimpleDisplayArticle(Article article) {
        super(article);
    }

    @Override
    protected void title() {
        System.out.println(article.getTitle());
    }

    @Override
    protected void content() {
        ArrayList<String> content = article.getContent();
        content.stream()
                .forEach(
                        x -> System.out.println(x)
                );
    }

    @Override
    protected void footer() {
        System.out.println(article.getFooter());
    }
}
