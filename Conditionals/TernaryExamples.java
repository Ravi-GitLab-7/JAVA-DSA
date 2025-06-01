package Conditionals;

public class TernaryExamples {
    public static void main(String[] args) {
        // Basic ternary
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Maximum is " + max);

        // Nested ternary
        int x = 15, y = 10, z = 5;
        int largest = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
        System.out.println("Largest number is " + largest);

        // Ternary in output
        System.out.println("The numbers are " + ((a == b) ? "equal" : "not equal"));

        // Conditional expression in return
        System.out.println("Absolute value: " + absoluteValue(-42));
    }

    public static int absoluteValue(int num) {
        return (num < 0) ? -num : num;
    }
}