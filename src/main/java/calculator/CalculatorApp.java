package calculator;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(2,3);
        calculator.deduct(4,5);
        System.out.println("Addition: "+ calculator.add( 2,3) + " Deduct: " + calculator.deduct(4,5));
    }

}
