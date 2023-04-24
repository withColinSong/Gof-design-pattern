package Facade;

public class Message {
    private Row row;

    private String getName() {
        return "Name : " + row.getName();
    }

    private String getBirthDay() {
        return "Birthday : " + row.getBirthDay();
    }

    private String getEmail() {
        return "Email : " + row.getEmail();
    }

    public void print() {
        System.out.println(this.getName());
        System.out.println(this.getBirthDay());
        System.out.println(this.getEmail());
    }



    public Message(Row row) {
        this.row = row;
    }
}
