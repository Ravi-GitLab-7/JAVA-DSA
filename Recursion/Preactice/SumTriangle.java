package Recursion.Preactice;
import java.util.Arrays; // required for Arrays.toString()
public class SumTriangle {
    static void printTriangle(int[] arr) {
        // Print current level first
        System.out.println(Arrays.toString(arr));
        // Stop when array has only one element
        if (arr.length == 1)
            return;
        // Make a smaller array for the next level
        int[] next = new int[arr.length - 1];
        // Fill next level with sums of consecutive elements
        for (int i = 0; i < arr.length - 1; i++) {
            next[i] = arr[i] + arr[i + 1];
        }
        // Recursive call
        printTriangle(next);
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("Sum Triangle:\n");
        printTriangle(arr);
    }
}
