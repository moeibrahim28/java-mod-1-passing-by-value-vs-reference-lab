public class Main {
    
    public static void main(String[] args) {
        
        NumberContainer myNumber = new NumberContainer();
        multiplyNumbers(myNumber, 12, 3);
        System.out.println("Result = " + myNumber.number);

        NumberContainer myNumber2 = new NumberContainer();
        multiplyNumbersCantSee(myNumber2, 12, 3);
        System.out.println("Result = " + myNumber.number);

        StringContainer myString = new StringContainer();
        myString.text = "initial value";
        addText(myString, " - adding new text");
        System.out.println("modified text: " + myString.text);

        String myString2 = "initial value";
        addTextCantSee(myString2, " - adding new text");
        System.out.println("modified text: " + myString2);
    }

    public static void multiplyNumbers(NumberContainer result, int firstNumber, int secondNumber) {
        result.number = firstNumber * secondNumber;
    }

    public static void multiplyNumbersCantSee(NumberContainer result, int firstNumber, int secondNumber) {
        result = new NumberContainer();
        result.number = firstNumber * secondNumber;
    }

    public static void addText(StringContainer result, String newText) {
        result.text = result.text + newText;
    }

    public static void addTextCantSee(String result, String newText) {
        result = result + newText;
    }
}


