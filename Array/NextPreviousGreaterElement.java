package Array;

public class NextPreviousGreaterElement {
    public static void main(String[] args) {
        int[] arr = {12, 34, 56, 67, 4, 34, 87, 89};
        int n = arr.length;
        int[] ans = new int[n];

        // Initialize first element to -1 as there is no previous element
        ans[0] = -1;

        for (int i = 1; i < n; i++) {
            int npe = -1; // Default to -1 if no previous greater element exists
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    npe = arr[j];
                    break; // Exit loop as soon as PGE is found
                }
            }
            ans[i] = npe; // Assign the Previous Greater Element to ans[i]
        }

        // Print the original array
        System.out.println("Original array:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // Print the Previous Greater Element array
        System.out.println("Previous Greater Element array:");
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}