package Conditionals;
public class AdvancedConditionals {
    public static void main(String[] args) {
        // Simple if statement
        boolean isRaining = true;
        if (isRaining) {
            System.out.println("Bring an umbrella!");
        }

        // If-else statement
        int temperature = 25;
        if (temperature > 30) {
            System.out.println("It's hot outside");
        } else {
            System.out.println("It's not too hot");
        }

        // If-else-if ladder
        int testScore = 85;
        if (testScore >= 90) {
            System.out.println("Grade: A");
        } else if (testScore >= 80) {
            System.out.println("Grade: B");
        } else if (testScore >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Below C");
        }
    }
}