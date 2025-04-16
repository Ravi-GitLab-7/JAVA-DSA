package Arrays;
import java.util.Scanner;

public class Duplicate_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int x = sc.nextInt();
        boolean found = false;
        int[] arr = {3, 4, 5, 1, 9};

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == x) {
                    System.out.println("SubArray is: ");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println(); // Move to next line after printing subarray
                    found = true;
                    break;
                }
            }
            if (found) break; // Exit outer loop if subarray is found
        }

        if (!found) {
            System.out.println("No subarray with the given sum found.");
        }
    }
}
