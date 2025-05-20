package Array;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        // Print the original array
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // Reverse the array using two-pointer technique
        for (int i = 0; i < n/2 ; i++) {
            int j = n - i - 1; // Corresponding index from the end
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Print the reversed array
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}