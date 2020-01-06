package Lesson11.Action;

import Lesson11.Service.ConsoleCalculator;
import Lesson11.Service.History;
import Lesson11.Service.NumberValidator;
import Lesson11.Utility.ConsoleReader;
import Lesson11.Utility.ConsoleWriter;
import Lesson11.Utility.Messages;

public class ConsoleCalcAction implements CalcAction {
    public void startCalc() {

        Messages.showGreetingCalcMessage();

        String answer = "";
        while(true) {
            double num1 = ConsoleReader.readDouble();
            double num2 = ConsoleReader.readDouble();
            Messages.showCalcOpMessage();
            String op = ConsoleReader.readString();

            if ( NumberValidator.validate(num1, num2) ) {
                double result = ConsoleCalculator.calculate(op, num1, num2);
                ConsoleWriter.write(result);
                History.addToHistory(op, num1, num2, result);
            }
            Messages.showCalcContinueMessage();
            answer = ConsoleReader.readString();

            if (answer.equals("no") || answer.equals("No")) {
                break;
            }
            else if (answer.equals("yes") || answer.equals("Yes") ) {
            }
            else {
                Messages.showErrorCommandMessage();
            }
        }
        Messages.showEndCalc();
    }
}
