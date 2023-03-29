import java.util.Scanner;

/**
 * @author David Burleson
 * Class CalculatorMain contains the main method and instantiates helpMethod, calculator and runProgram.
 * Then processes string input from the scanner to assign a string value to runProgram.
 * The result will then be used in an if statment to determine whether to run calculator.display() first,
 * or helpMethod.assist() first, then calculator.display().
 * The if statment is contained within a do while loop that will repeat the program indefinatly every time an answer is given.
 */

public class CalculatorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**
         * helpMethod is constructed from Help()
         * calculator is constructed from Display()
         * String runProgram is declared
         */

        Help helpMethod = new Help();
        Display calculator = new Display();
        String runProgram = "";

        /**
         * runProgram processes string input from the scanner which is then used by the if statement and do while loop
         * to trigger the order of program execution and whether it will repeat it's self.
         */

        do {
            System.out.println("Would you like to run the program? (y/n), or enter \"help\" to get help.");
            runProgram = sc.nextLine();

            /**
             * The if statement uses the input from runProgram to determine whether to run
             * calculator.display() with a try catch exception to detect and report input errors,
             * or to run helpMethod.assist() followed by calculator.display().
             */

            if (runProgram.equalsIgnoreCase("y")) {
                try {
                    calculator.display();
                } catch (Exception e) {
                    System.out.println("Error, please restart the program and enter \"help\" for operation instructions.");
                }
            } else if (runProgram.equalsIgnoreCase("help")) {
                helpMethod.assist();
                calculator.display();
            }

            /**
             * The do while loop will repeat the program as long as the user enters positive input when asked to run the program.
             * If the user enters anything other than "y" or "help", then the program will automatically end.
             */

        } while ((runProgram.equalsIgnoreCase("y")) || (runProgram.equalsIgnoreCase("help")));
    }
}