package Recursion.Preactice;
import java.util.Scanner;
public class sumBetweenAandB {
    public static int sum(int a, int b) {
        // Base case
        if (a > b) {
            return 0;
        }
        // Recursive case
        return a + sum(a + 1, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the integer of b: ");
        int b = sc.nextInt();
        int result = sum(a, b);
        System.out.println("Sum between " + a + " and " + b + " is: " + result);
    }
}
