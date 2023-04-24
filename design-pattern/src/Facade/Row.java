package Facade;

public class Row {
    private String name;
    private String birthDay;
    private String email;

    public Row(String name, String birthDay, String email) {
        this.name = name;
        this.birthDay = birthDay;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getEmail() {
        return email;
    }
}
