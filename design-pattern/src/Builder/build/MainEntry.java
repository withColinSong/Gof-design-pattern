package Builder.build;

public class MainEntry {
    public static void main(String[] args) {

        Data data = new Data("song", "20");

        Director director1 = new Director(new JsonTextBuilder(data));
        Director director2 = new Director(new PlainTextBuilder(data));

        System.out.println(director1.build());
        System.out.println(director2.build());

    }
}
