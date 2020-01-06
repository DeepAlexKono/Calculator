package Lesson11.Utility;

import Lesson11.Entity.User;

public class Messages {
    // ------------------------------------
    // APP MESSAGES
    public static void showStartAppMessage() {
        ConsoleWriter.write("Приложение запущенно...");
    }
    public static void showEndAppMessage() {
        ConsoleWriter.write("Приложение завершило работу.");
    }
    public static void showGreetingMainMessage() {
        ConsoleWriter.write("Добро пожаловать в ConsoleApplication!");
    }
    // ------------------------------------
    // MAIN MENU MESSAGES
    public static void showMainMenuMessage() {
        Messages.showLine();
        ConsoleWriter.write("ГЛАВНОЕ МЕНЮ");
        Messages.showLine();
    }
    // ------------------------------------
    // REGISTRATION MESSAGES
    public static void showStartRegMessage() {
        Messages.showLine();
        ConsoleWriter.write("РЕГИСТРАЦИЯ");
        Messages.showLine();
    }
    public static void showLoginMessage() {
        ConsoleWriter.write("Введите логин:");
    }
    public static void showPasswordMessage() {
        ConsoleWriter.write("Введите пароль:");
    }
    public static void showRegSucMessage() {
        ConsoleWriter.write("Вы успешно зарегестрированы!");
    }
    public static void showRegFailedMessage() {
        ConsoleWriter.write("Пользователь с таким именем уже существует! Попробуйте ещё раз (Continue/Exit)");
    }
    // ------------------------------------
    // AUTHORIZATION MESSAGES
    public static void showStartAuthMessage() {
        Messages.showLine();
        ConsoleWriter.write("АВТОРИЗАЦИЯ");
        Messages.showLine();
    }
    public static void showAuthSucMessage() {
        ConsoleWriter.write("Вы успешно авторизированы!");
    }
    public static void showAuthFailedMessage() {
        ConsoleWriter.write("Неверный Логин или Пароль! Попробуйте ещё раз (Continue/Exit)");
    }
    // ------------------------------------
    // COMMANDS MESSAGES
    public static void showMainCommandsMessage() {
        ConsoleWriter.write("Чтобы зарегистрироваться введите Reg");
        ConsoleWriter.write("Чтобы авторизироваться введите Aut");
        ConsoleWriter.write("Чтобы выйти из приложения введите Exit");
    }
    public static void showSucAuthCommandsMessage() {
        ConsoleWriter.write("Чтобы запустить калькулятор введите Calc");
        ConsoleWriter.write("Чтобы посмотреть историю введите Hist");
        ConsoleWriter.write("Чтобы завершить сессию введите Exit");
    }
    public static void showRegCommandsMessage() {
        ConsoleWriter.write("Чтобы выйти из регистрации введите Exit");
        ConsoleWriter.write("Чтобы продолжить регистрацию введите Continue");
    }
    public static void showAuthCommandsMessage() {
        ConsoleWriter.write("Чтобы выйти из авторизации введите Exit");
        ConsoleWriter.write("Чтобы продолжить авторизацию введите Continue");
    }
    public static void showErrorCommandMessage() {
        System.out.println("Ошибка ввода. Попробуйте ещё раз...");
    }
    // ------------------------------------
    // CALCULATOR MESSAGES
    public static void showGreetingCalcMessage() {
        ConsoleWriter.write("Добро пожаловать в калькулятор!");
    }
    public static void showCalcOpMessage() {
        ConsoleWriter.write("Введите операцию: ");
    }
    public static void showCalcContinueMessage() {
        ConsoleWriter.write("Хотите продолжить? (yes/no)");
    }
    public static void showEndCalc() {
        ConsoleWriter.write("Калькулятор завершил работу");
    }

    // ------------------------------------
    // SESSION MESSAGES
    public static void showStartSessionMessage(User currentUser) {
        ConsoleWriter.write("Вы вошли как " + currentUser.getLogin());
    }
    public static void showEndSessionMessage() {
        ConsoleWriter.write("Вы завершили текущую сессию.");
    }


    // SUB-MESSAGES
    public static void showLine() {
        ConsoleWriter.write("------------------------");
    }
}
