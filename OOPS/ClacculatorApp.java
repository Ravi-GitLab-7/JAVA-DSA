package OOPS;

class Calculator {
    // Method for integer addition
    int add(int a, int b) {
        return a + b; // Example: Adding two integers
    }

    // Overloaded method for float addition
    float add(float a, float b) {
        return a + b; // Example: Adding two floats
    }
}

public class ClacculatorApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Call the method for integer addition
        int intResult = calc.add(10, 20);
        System.out.println("Integer addition result: " + intResult);

        // Call the method for float addition
        float floatResult = calc.add(10.2f, 20.3f); // Passing float values
        System.out.println("Float addition result: " + floatResult);
    }
}