package Array.PRACTICE;

import java.util.Arrays;

public class SortingOneZeros {
    public static void main(String[] args) {
        int noOfZeros = 0;
        int[] arr = {0, 1, 0, 0, 1, 1, 0, 0, 1};

        // Count zeros
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) noOfZeros++;
        }

        // Modify array based on count
        for (int i = 0; i < arr.length; i++) {
            if (i < noOfZeros) arr[i] = 0; // Fill with 0
            else arr[i] = 1;              // Fill with 1
        }

        // Print the array
        System.out.println(Arrays.toString(arr));
    }
}