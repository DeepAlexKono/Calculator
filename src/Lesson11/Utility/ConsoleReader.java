package Lesson11.Utility;

import java.util.Scanner;

public class ConsoleReader {
    public static double readDouble() {
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        return a;
    }
    public static String readString() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        return a;
    }
}
