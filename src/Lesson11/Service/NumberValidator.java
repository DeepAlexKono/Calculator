package Lesson11.Service;

import Lesson11.Utility.ConsoleWriter;

public class NumberValidator {
    public static boolean validate(double a, double b) {
        if (b == 0) {
            showError();
            return false;
        }
        else return true;
    }

    private static void showError() {
        ConsoleWriter.write("Ошибка! Деление на ноль.");
    }
}
