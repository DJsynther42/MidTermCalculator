/**
 * Class FirstValue declares the num1 string and instantiates it as FirstValue making it publicly available for the Display class to assign a value to it.
 */

public class FirstValue {

    public String num1 = "";

    public FirstValue(String num1) {
        setNum1(num1);
    }

    public String toString() {
        String returnString = "\n";
        returnString += getNum1() + "\n";
        return returnString;
    }

    public String getNum1() {
        return num1;
    }
    public void setNum1(String num1) {
        this.num1 = num1;
    }
}