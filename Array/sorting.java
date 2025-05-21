package Array;
import java.util.Arrays;
public class sorting {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 1, 1, 1, 1, 0, 0};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        Arrays.sort(arr); // Sorting the array
        System.out.println();

        // Printing the sorted array
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}