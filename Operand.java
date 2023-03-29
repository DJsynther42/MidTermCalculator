/**
 * Class Operand declares the operation string and instantiates it as Operand making it publicly available for the Display class to assign a value to it.
 */

public class Operand {

    public String operation = "";

    public Operand (String operation) {
        setOperation(operation);
    }

    public String toString() {
        String returnString = "\n";
        returnString += getOperation() + "\n";
        return returnString;
    }

    public String getOperation() {
        return operation;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }
}
