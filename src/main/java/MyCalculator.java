import java.util.*;

public class MyCalculator {

    public static String operationValue = "";

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        MyCalculator myCalculator = new MyCalculator();

        System.out.println("Welcome to basic calculator...");


        System.out.println("Please enter first number...");
        double userFirstNumInput = scanner.nextDouble();

        System.out.println("Please enter math operation... '+', '-', '*', '/' ");
        operationValue = scanner.next();

        System.out.println("Enter second Number...");
        double userSecondNumInput = scanner.nextDouble();

        System.out.println(myCalculator.mathCalculation(userFirstNumInput, userSecondNumInput));

    }


    public String userMathOperatorChoice() {

        try {
            if (operationValue.equalsIgnoreCase("+")) {
                return operationValue;
            } else if (operationValue.equalsIgnoreCase("-")) {
                return operationValue;
            } else if (operationValue.equalsIgnoreCase("*")) {

            } else if (operationValue.equalsIgnoreCase("/")) {
                return operationValue;
            } else {
                return "Sorry, at this point just '+', '-', '*', '/' are sported";
            }
        } catch (Exception e) {
            System.out.println("Sorry, your input should be: '+', '-', '*', '/' ... try again");
        }
        return "";
    }


    public double mathCalculation(double firstNum, double secondNum) {

        switch (userMathOperatorChoice()) {

            case "+":
                return firstNum + secondNum;
            case "-":
                return firstNum - secondNum;
            case "*":
                return firstNum * secondNum;
            case "/":
                return firstNum / secondNum;
            default:
                System.out.println("The math operator is not supported...");
        }
        return 0;
    }
}
