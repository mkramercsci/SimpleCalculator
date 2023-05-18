
//        Before coding, you must create a flowchart and class diagram for your program. Please show the diagrams to your instructor or mentor before starting to write code.
//        Design a class (no main method) called SimpleCalculator that performs basic math operations (addition, subtraction, multiplication, division) on two operands.
//        Create another class called App that presents a simple console calculator UI to the user. This second class should handle all user input and console output and must use the first class to perform all of the math operations.
//        The UI should give the user a choice of operations. One of the choices should be to exit the program.
//        After the user selects an operation, the UI should ask the user for two operands and then display the result of the calculation.
//        The UI should then display the menu of choices again.
//        When the user chooses to exit the program, the UI should print a thank you message.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        Scanner inScanner = new Scanner(System.in);

        int menuSelection = 0;
        double first = 0;
        double second = 0;
        double result = 0;

        boolean doAgain = true;

        System.out.println("Welcome to Simple Calculator.");

        do {
            System.out.println("Please select an option.");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Quit");

            // check that it is in range
            menuSelection = Integer.parseInt(inScanner.nextLine());
            if (menuSelection < 1 || menuSelection > 5)
            {
                System.out.println("Error: bad input.");
                //continue;
            }

            // check for quit condition
            if (menuSelection != 5) {
                System.out.println("Enter first operand:");
                first = Integer.parseInt(inScanner.nextLine());

                System.out.println("Enter second operand:");
                second = Integer.parseInt(inScanner.nextLine());
            }

            calculator.setFirst(first);
            calculator.setSecond(second);

            switch (menuSelection) {
                case 1:
                    result = calculator.add();
                    System.out.println(first + " + " + second + " = " + result);
                    break;
                case 2:
                    result = calculator.subtract();
                    System.out.println(first + " - " + second + " = " + result);
                    break;
                case 3:
                    result = calculator.multiply();
                    System.out.println(first + " * " + second + " = " + result);
                    break;
                case 4:
                    result = calculator.divide();
                    System.out.println(first + " / " + second + " = " + result);
                    break;
                case 5:
                    System.out.println("Thank you! Goodbye!");
                    doAgain = false;
                    break;
                default:
                    // this shouldn't happen
                    System.out.println("Something went wrong.");
                    break;
            }

        } while (doAgain);
    }
}
