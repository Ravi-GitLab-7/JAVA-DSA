package PatternPrinting.CompositeNumber;

import java.util.Scanner;

public class Extraone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the input number: ");
        int input = scanner.nextInt();
        scanner.close();

        // Generate the pattern
        printPattern(input);
    }

    // Method to print the full pattern
    public static void printPattern(int n) {
        // Upper half of the pattern
        for (int i = 1; i <= n; i++) {
            printRow(i, n);
        }

        // Lower half of the pattern
        for (int i = n - 1; i >= 1; i--) {
            printRow(i, n);
        }
    }

    // Helper method to print one row of the pattern
    public static void printRow(int i, int n) {
        // Print increasing numbers
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }

        // Print repeating middle numbers
        for (int k = i; k <= n; k++) {
            System.out.print(i);
        }

        // Print decreasing numbers
        for (int l = i - 1; l >= 1; l--) {
            System.out.print(l);
        }

        // Move to the next line
        System.out.println();
    }
}
