import org.junit.Assert;
import org.junit.Test;

public class MyCalculatorTest {

    MyCalculator myCalculator = new MyCalculator();


    @Test
    public void userMathOperatorChoice() {

        String input = "+";
        MyCalculator.operationValue = input;
        String expected = "+";
        String actual = myCalculator.userMathOperatorChoice();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void userMathOperatorChoiceTestingAWrongInput() {
        String input = "0";
        MyCalculator.operationValue = input;
        String expected = "Sorry, at this point just '+', '-', '*', '/' are sported";
        String actual = myCalculator.userMathOperatorChoice();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mathCalculationTest() {

        String input = "+";
        MyCalculator.operationValue = input;
        double expected = 3;
        double actual = myCalculator.mathCalculation(2, 1);
        Assert.assertEquals(expected, actual, 0);

    }


}
