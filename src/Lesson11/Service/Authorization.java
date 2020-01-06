package Lesson11.Service;

import Lesson11.Action.ConsoleApplication;
import Lesson11.Entity.ConsoleUser;

public class Authorization {
    public static void authorize(String login, String password) {
        ConsoleApplication.setCurrentUser(new ConsoleUser(login, password));
        ConsoleApplication.setAuthFlag(true);
    }
    public static boolean CheckAuth(String login, String password) {
        for (int i = 0; i < ConsoleApplication.getUsersDatabase().size(); i++) {
            if (login.equals( ConsoleApplication.getUsersDatabase().get(i).getLogin() ) && password.equals(ConsoleApplication.getUsersDatabase().get(i).getPassword()) ) {
                return true;
            }
        }
        return false;
    }
}
