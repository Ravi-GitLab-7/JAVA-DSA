package OOPS.Abstract;

// Interface defining basic calculator operations
interface ICalculator {
    void add(int a, int b);
    void sub(int a, int b);
}

// Parent class with advanced calculator operations
class CalculatorAdvanced {
    public void mul(int a, int b) {
        System.out.println("The multiplication is :: " + (a * b));
    }

    public void div(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        }
        System.out.println("The division is :: " + (a / b));
    }
}

// Child class that extends CalculatorAdvanced and implements the ICalculator interface
class CalculatorImpl extends CalculatorAdvanced implements ICalculator {
    @Override
    public void add(int a, int b) {
        System.out.println("The sum is :: " + (a + b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("The difference is :: " + (a - b));
    }
}

// Main class for testing the calculator
public class test3 {
    public static void main(String[] args) {
        // Using the interface reference to demonstrate loose coupling
        ICalculator calculator = new CalculatorImpl();

        // Invoking methods declared in ICalculator
        calculator.add(10, 20);
        calculator.sub(100, 20);

        // Casting to access CalculatorAdvanced methods
        CalculatorAdvanced advancedCalculator = (CalculatorAdvanced) calculator;
        advancedCalculator.mul(10, 20);
        advancedCalculator.div(100, 20);
        advancedCalculator.div(10, 0); // Example for division by zero
    }
}