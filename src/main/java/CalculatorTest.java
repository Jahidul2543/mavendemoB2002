import org.testng.Assert;
import org.testng.annotations.Test;

/**
   * @ClaculatorTest class is to test @Calculator class
   * This is not part of application code but it is testing code for the
   * app named Calculator
   * */

public class CalculatorTest {

    // I would like to test add() from Calculator.java class
    // this is a test method not part of main application

      @Test
    public void addTest() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(2,2);
        System.out.println(actualResult);
        int expectedResult = 4;

        // I want to compare expectedResult vs actualResult to ensure add() method is working

        Assert.assertEquals(expectedResult, actualResult); //

        System.out.println("expectedResult is equal to actualResult, thus add() method is working good ");
    }
    @Test
    public void deductTest(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.deduct(2,2);
        Assert.assertEquals(1, actualResult);
    }

}
