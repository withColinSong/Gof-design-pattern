package Builder.build;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public String build() {
        StringBuilder sb = new StringBuilder();

        sb.append(builder.head())
            .append(builder.body())
            .append(builder.footer());

        return sb.toString();
    }
}
