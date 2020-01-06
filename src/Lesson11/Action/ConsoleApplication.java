package Lesson11.Action;

import Lesson11.Utility.ConsoleReader;
import Lesson11.Utility.ConsoleWriter;
import Lesson11.Utility.Messages;
import Lesson11.Entity.User;

import java.util.ArrayList;
import java.util.List;

public class ConsoleApplication implements Application {
    private static List<User> usersDatabase = new ArrayList<>();
    private static User currentUser = null; // User of current app session
    private static boolean authFlag = false;
    boolean exitFlag = true;

    UserAction userAction = new ConsoleUserAction();
    CalcAction calcAction = new ConsoleCalcAction();

    public static void setAuthFlag(boolean authFlag) {
        ConsoleApplication.authFlag = authFlag;
    }

    public static void setCurrentUser(User currentUser) {
        ConsoleApplication.currentUser = currentUser;
    }
    public static User getCurrentUser() {
        return currentUser;
    }

    public static List<User> getUsersDatabase() {
        return usersDatabase;
    }
    public static void addToDatabase(User newUser) {
        usersDatabase.add(newUser);
    }

    public static void showLastUser() {
        ConsoleWriter.write(usersDatabase.get(usersDatabase.size() - 1).toString() );
    }
    public static void showAllUsers() {
        for (int i = 0; i < usersDatabase.size(); i++) {
            ConsoleWriter.write(usersDatabase.get(i).toString());
        }
    }

    public void run() {
        Messages.showStartAppMessage();
        Messages.showGreetingMainMessage();
        String answer = "";
        while (exitFlag) {
            if (authFlag) {
                Messages.showStartSessionMessage(currentUser);
                Messages.showLine();
                Messages.showSucAuthCommandsMessage();
                answer = ConsoleReader.readString();
                try {
                    CheckMenuAnswer(answer);
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            else {
                Messages.showMainMenuMessage();
                Messages.showMainCommandsMessage();
                answer = ConsoleReader.readString();
                try {
                    CheckMenuAnswer(answer);
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }

    private void CheckMenuAnswer(String answer) throws Exception {
        if (authFlag) {
            if (answer.equals("Calc") || answer.equals("calc") ) {
                calcAction.startCalc();
            }
            else if (answer.equals("Hist") || answer.equals("hist") ) {
                userAction.showHistory();
            }
            else if ( answer.equals("Exit") || answer.equals("exit") ) {
                authFlag = false;
            }
            else  {
                throw new Exception("Ошибка ввода. Попробуйте ещё раз...");
            }
        }
        else {
            if (answer.equals("Reg") || answer.equals("reg") ) {
                userAction.startRegistration();
            }
            else if (answer.equals("Aut") || answer.equals("aut") ) {
                userAction.startAuthorization();
            }
            else if ( answer.equals("Exit") || answer.equals("exit") ) {
                exitFlag = false;
            }
            else  {
                throw new Exception("Ошибка ввода. Попробуйте ещё раз...");
            }
        }
    }

}
