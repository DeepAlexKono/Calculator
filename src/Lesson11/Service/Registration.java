package Lesson11.Service;

import Lesson11.Action.ConsoleApplication;
import Lesson11.Entity.ConsoleUser;
import Lesson11.Entity.User;

public class Registration {
    public static void registrate(String login, String password) {
        User user = new ConsoleUser();

        user.setLogin(login);
        user.setPassword(password);
        ConsoleApplication.addToDatabase(user);

    }
    public static boolean checkLogin(String login) {
        for (int i = 0; i < ConsoleApplication.getUsersDatabase().size(); i++) {
            if (login.equals( ConsoleApplication.getUsersDatabase().get(i).getLogin() ) ) {
                return true;
            }
        }
        return false;
    }

}
