package Conditionals;
import java.util.Scanner;
public class ConditionalExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simple if statement
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        // if-else statement
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // else-if ladder
        System.out.print("Enter your test score (0-100): ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // Nested if statement
        System.out.print("Enter current temperature (in °C): ");
        double temperature = scanner.nextDouble();
        System.out.print("Is it raining? (true/false): ");
        boolean isRaining = scanner.nextBoolean();

        if (temperature < 10) {
            if (isRaining) {
                System.out.println("Cold and rainy - wear a heavy coat and take an umbrella!");
            } else {
                System.out.println("Cold but dry - wear a heavy coat.");
            }
        } else if (temperature < 20) {
            System.out.println("Cool weather - a light jacket will do.");
        } else {
            if (isRaining) {
                System.out.println("Warm but rainy - take an umbrella.");
            } else {
                System.out.println("Warm and dry - enjoy the weather!");
            }
        }

        // Switch statement
        System.out.print("Enter a day number (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }

        // Ternary operator
        System.out.print("Enter another number: ");
        int num = scanner.nextInt();
        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println("The number is " + result);

        scanner.close();
    }
}