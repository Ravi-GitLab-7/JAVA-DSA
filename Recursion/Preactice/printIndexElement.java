package Recursion.Preactice;
import java.util.Scanner;
public class printIndexElement {
    public static int printIndex(int i, int[] arr, int target) {
        // Base case
        if (i == arr.length) {
            return -1;
        }
        // If element found, return its index
        if (arr[i] == target) {
            return i;
        }
        // Recursive call to next element
        return printIndex(i + 1, arr, target);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element: ");
        int target = sc.nextInt();
        int index = printIndex(0, arr, target);
        if (index != -1)
            System.out.println("Element " +target +" found at index " + index);
        else
            System.out.println("Element not found");
    }
}
