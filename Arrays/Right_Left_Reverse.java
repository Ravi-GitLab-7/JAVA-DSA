package Arrays;

public class Right_Left_Reverse {

    // Rotate the array to the right by k positions
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // To handle k > n
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    // Utility method to reverse a portion of an array
    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Method to print the array
    public static void print(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Original array:");
        print(arr);

        // Reverse the whole array
        reverse(arr, 0, arr.length - 1);
        System.out.println("Array after full reverse:");
        print(arr);

        // Rotate right by 3 positions
        rotateRight(arr, 3);
        System.out.println("Array after rotating right by 3:");
        print(arr);
    }
}
