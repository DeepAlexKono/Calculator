package Lesson11.Action;

import Lesson11.Service.Authorization;
import Lesson11.Service.History;
import Lesson11.Service.Registration;
import Lesson11.Utility.ConsoleReader;
import Lesson11.Utility.Messages;

public class ConsoleUserAction implements UserAction {

    @Override
    public void startRegistration() {
        String login = "";
        String password = "";
        String answer = "";

        Messages.showStartRegMessage();
        Messages.showRegCommandsMessage();
        while (true) {
            answer = ConsoleReader.readString();
            if (answer.equals("Exit") || answer.equals("exit")) {
                break;
            }
            else if (answer.equals("Continue") || answer.equals("continue")) {
                Messages.showLoginMessage();
                login = ConsoleReader.readString();
                Messages.showPasswordMessage();
                password = ConsoleReader.readString();
            }
            else {
                Messages.showErrorCommandMessage();
                continue;
            }

            if (Registration.checkLogin(login)) {
                Messages.showRegFailedMessage();
            }
            else {
                Registration.registrate(login, password);
                Messages.showRegSucMessage();
                break;
            }
        }
    }

    @Override
    public void startAuthorization() {
        String login = "";
        String password = "";
        String answer = "";

        Messages.showStartAuthMessage();
        Messages.showAuthCommandsMessage();
        while (true) {
            answer = ConsoleReader.readString();
            if (answer.equals("Exit") || answer.equals("exit")) {
                break;
            }
            else if (answer.equals("Continue") || answer.equals("continue")) {
                Messages.showLoginMessage();
                login = ConsoleReader.readString();
                Messages.showPasswordMessage();
                password = ConsoleReader.readString();
            }
            else {
                Messages.showErrorCommandMessage();
                continue;
            }

            if (Authorization.CheckAuth(login, password)) {
                Authorization.authorize(login, password);
                Messages.showAuthSucMessage();
                break;
            }
            else {
                Messages.showAuthFailedMessage();
            }
        }

    }

    @Override
    public void showHistory() {
        History.getCurrentUserHistory();
    }
}
