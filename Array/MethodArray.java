package Array;
import java.util.Arrays; // Correct import for the Arrays utility class
public class MethodArray {
    public static void main(String[] args) {
        int[] arr = {23,50,90,4,105, 34, 45, 23, 34};

        // Print original array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        // Sort the array
        Arrays.sort(arr);
        System.out.println();

        // Print sorted array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}