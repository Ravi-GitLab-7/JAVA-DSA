package Arrays;

import java.util.Arrays;

public class ArrayRotation {

    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k % n == 0) return;

        k = k % n; // In case k > n
        reverse(arr, 0, n - 1);       // Reverse whole array
        reverse(arr, 0, k - 1);       // Reverse first k elements
        reverse(arr, k, n - 1);       // Reverse remaining n-k elements
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original array: " + Arrays.toString(array));
        rotateRight(array, k);
        System.out.println("Array after rotating by " + k + " steps: " + Arrays.toString(array));
    }
}
