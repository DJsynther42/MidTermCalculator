/**
 * Class SecondValue declares the num2 string and instantiates it as SecondValue making it publicly available for the Display class to assign a value to it.
 */

public class SecondValue {

    public String num2 = "";

    public SecondValue (String num2) {
        setNum2(num2);
    }

    public String toString() {
        String returnString = "\n";
        returnString += getNum2() + "\n";
        return returnString;
    }

    public String getNum2() {
        return num2;
    }
    public void setNum2(String num2) {
        this.num2 = num2;
    }

}
