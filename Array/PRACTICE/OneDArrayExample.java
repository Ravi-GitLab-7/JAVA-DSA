package Array.PRACTICE;
import java.util.Scanner;

public class OneDArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare the array
        int[] numbers = new int[size];

        // Input elements into the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Display elements of the array
        System.out.println("You entered:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        scanner.close();
    }
}
