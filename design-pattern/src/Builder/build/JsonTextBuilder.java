package Builder.build;

public class JsonTextBuilder extends Builder {
    public JsonTextBuilder(Data data) {
        super(data);
    }

    @Override
    public String head() {
        return " { ";
    }

    @Override
    public String body() {
        StringBuilder sb = new StringBuilder();

            sb
                .append("\"name\" : ")
                .append("\"")
                .append(data.getName())
                .append("\"")
                .append(",")
                .append("\"")
                .append("age : ")
                .append("\"")
                .append(data.getAge())
                .append("\"");

        return sb.toString();
    }

    @Override
    public String footer() {
        return " } ";
    }

}
