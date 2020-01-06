package Lesson11.Service;

public final class ConsoleCalculator {
    public static double calculate(String op, double num1, double num2) {
        return ConsoleCalculator.CheckOp(op, num1, num2);
    }

    private static double CheckOp(String op, double num1, double num2) {
        double result = 0;
        switch (op) {
            case "+": {
                result = ConsoleCalculator.sum(num1, num2);
                break;
            }
            case "-": {
                result = ConsoleCalculator.sub(num1, num2);
                break;
            }
            case "*": {
                result = ConsoleCalculator.mul(num1, num2);
                break;
            }
            case "/":  {
                result = ConsoleCalculator.div(num1, num2);
                break;
            }
            default: result = 0;
        }
        return result;
    }
    private static double sum(double a, double b) { return (a + b);   }
    private static double sub(double a, double b) { return (a - b);   }
    private static double mul(double a, double b) { return (a * b);   }
    private static double div(double a, double b) { return (a / b);   }

}
