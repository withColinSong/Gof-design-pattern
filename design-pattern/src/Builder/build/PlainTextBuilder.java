package Builder.build;

public class PlainTextBuilder extends Builder {

    public PlainTextBuilder(Data data) {
        super(data);
    }

    @Override
    public String head() {
        return "";
    }

    @Override
    public String body() {
        StringBuilder sb = new StringBuilder();

        sb.append("name - ")
                .append(data.getName())
                .append(", age - ")
                .append(data.getAge());

        return sb.toString();
    }

    @Override
    public String footer() {
        return "";
    }
}
