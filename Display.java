import java.util.Scanner;

/**
 * Class Display instantiates FirstValue, Operand and SecondValue and assigns them a string value through the scanner input.
 * Then using a series of if statements, the string values are converted to double variables or math classes.
 * these results are then run through a final if statement to calculate the result of the input combinations.
 */

public class Display {

    public void display () {

        Scanner input = new Scanner(System.in);

        /**
         * Value1 is constructed from FirstValue()
         * op is constructed from Operand()
         * Value2 is constructed from SecondValue()
         * Doubles flip1 and flip2 are declared
         */

        FirstValue value1 = new FirstValue("");
        Operand op = new Operand("");
        SecondValue value2 = new SecondValue("");
        double flip1;
        double flip2;

        /**
         * Object Value1.num1() is assigned a string value through the scanner input,
         * which is then used by the if statement to assign a double or math class value to flip1.
         */

        System.out.println("Enter the first value (number, \"pi\", \"e\") : ");
        value1.num1 = input.nextLine();

        if (value1.num1.equalsIgnoreCase("pi")) {
            flip1 = Math.PI;
        } else if (value1.num1.equalsIgnoreCase("e")) {
            flip1 = Math.E;
        } else {
            flip1 = Double.parseDouble(value1.num1);
        }

        /**
         * Object op.operation() is assigned a string value through the scanner input
         */

        System.out.println("Enter an operator (+, -, *, /, %, \"power\", \"root\") :");
        op.operation = input.nextLine();

        /**
         * Object Value2.num2() is assigned a string value through the scanner input,
         * which is then used by the if statement to assign a double or math class value to flip2.
         */

        System.out.println("Enter the second value (number, \"pi\", \"e\") : ");
        value2.num2 = input.nextLine();

        if (value2.num2.equalsIgnoreCase("pi")) {
            flip2 = Math.PI;
        } else if (value2.num2.equalsIgnoreCase("e")) {
            flip2 = Math.E;
        } else {
            flip2 = Double.parseDouble(value2.num2);
        }

        /**
         * The doubles power and root are declared and assigned Math.pow values to function as calculator operators.
         */

        double power = Math.pow(flip1, flip2);
        double root = Math.pow(flip1, 1.0 / flip2);

        /**
         * This if statement uses the assigned string value of op.operation() to determine the combined double value of flip1 and flip2.
         * And will display an error message if an invalid operator is used.
         */

        if (op.operation.equals("+")) {
            System.out.println("Your answer is " + (flip1 + flip2) + "\n");
        } else if (op.operation.equals("-")) {
            System.out.println("Your answer is " + (flip1 - flip2) + "\n");
        } else if (op.operation.equals("/")) {
            System.out.println("Your answer is " + (flip1 / flip2) + "\n");
        } else if (op.operation.equals("*")) {
            System.out.println("Your answer is " + (flip1 * flip2) + "\n");
        } else if (op.operation.equals("%")) {
            System.out.println("Your answer is " + (flip1 % flip2) + "\n");
        } else if (op.operation.equalsIgnoreCase("power")) {
            System.out.println("Your answer is " + (power) + "\n");
        } else if (op.operation.equalsIgnoreCase("root")) {
            System.out.println("Your answer is " + (root) + "\n");
        } else System.out.println("Error, incorrect operator.");
    }
}

