import java.util.Scanner;
import java.util.Scanner;
public class SumOfNumberAndReverse {

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number; // Store the original number
        int reversedNumber = 0; // Initialize the reversed number
        int sum = 0;

        // Reverse the number using a while loop
        while (number != 0) {
            int digit = number % 10;       // Get the last digit
            reversedNumber = reversedNumber * 10 + digit;  // Build the reversed number
            number /= 10;                  // Remove the last digit from the original number
        }

        // Calculate the sum of the original number and the reversed number
        sum = originalNumber + reversedNumber;

        // Display the results
        System.out.println("The reversed number is: " + reversedNumber);
        System.out.println("The sum of the original number and its reverse is: " + sum);
    }
}
