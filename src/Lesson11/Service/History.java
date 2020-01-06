package Lesson11.Service;

import Lesson11.Action.ConsoleApplication;
import Lesson11.Utility.ConsoleWriter;

public class History {
    public static void getCurrentUserHistory() {
        for (int i = 0; i < ConsoleApplication.getUsersDatabase().size(); i++) {
            if (ConsoleApplication.getCurrentUser().getLogin().equals( ConsoleApplication.getUsersDatabase().get(i).getLogin() ) ) {
                for (int k = 0; k < ConsoleApplication.getUsersDatabase().get(i).getHistory().size(); k++) {
                    ConsoleWriter.write( ConsoleApplication.getUsersDatabase().get(i).getHistory().get(k) );
                }
                break;
            }
        }
    }

    public static void addToHistory(String op, double num1, double num2, double result) {
        for (int i = 0; i < ConsoleApplication.getUsersDatabase().size(); i++) {
            if (ConsoleApplication.getCurrentUser().getLogin().equals( ConsoleApplication.getUsersDatabase().get(i).getLogin() ) ) {
                ConsoleApplication.getCurrentUser().getHistory().add(num1 + " " + op + " " + num2 + " = " + result);
                ConsoleApplication.getUsersDatabase().get(i).getHistory().add(num1 + " " + op + " " + num2 + " = " + result);
                break;
            }
        }
    }
}
