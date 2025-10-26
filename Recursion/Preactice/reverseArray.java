package Recursion.Preactice;
import java.util.ArrayList;
import java.util.Arrays;
public class reverseArray {
    public static void printReverse(int i, int j, int[] arr, ArrayList<Integer> ans) {
        // Base case: if i > j, print and stop recursion
        if (i > j) {
            System.out.println("Reversed Array: " + ans);
            return;
        }
        // Add elements in reverse order
        ans.add(arr[j]);
        // Recursive call
        printReverse(i, j - 1, arr, ans);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int i = 0, j = n - 1;
        printReverse(i, j, arr, new ArrayList<>());
    }
}
