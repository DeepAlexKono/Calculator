package Lesson11.Entity;

public class ConsoleUser extends User {

    public ConsoleUser() {
        super();
    }
    public ConsoleUser(String login, String password) {
        super(login, password);
    }

    @Override
    public String toString() {
        return ("{login: " + this.getLogin() + ", password: " + this.getPassword() + "}");
    }
}
