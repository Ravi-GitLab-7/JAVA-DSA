package OOPS;

public class LocalVariable {
    // Inner class
    class Calculator {
        public void add(int a, int b) {
            int result = a + b;
            System.out.println("Sum is: " + result);
        }
    }

    public static void main(String[] args) {
        LocalVariable outer = new LocalVariable(); // Create an instance of the outer class
        LocalVariable.Calculator c = outer.new Calculator(); // Ensure proper inner class instantiation
        c.add(10, 20);
    }
}
