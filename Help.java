/**
 * CLass Help implements the assist object from Interface and assigns a printed string to it.
 */

public class Help implements Interface {

    @Override
    public void assist() {
        System.out.println("Please type your first number or value eg(\"42\", \"pi\", \"e\"), and press enter. \nThen type your operator eg(Plus(+), Minus(-), Multiply(*), Divide(/), Modulo(%), Power(\"power\"), Nth-Root(\"root\")), and press enter. \nThen type your second number or value and press enter to get your answer.");
        System.out.println();
    }
}
