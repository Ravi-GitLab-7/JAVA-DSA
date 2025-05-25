package Array.PRACTICE;

public class SortNegitiveThenPositive {
    public static void main(String[] args) {
        int[] array = {-2, 8, 1, -5, 6, -3, 9, -11};
        System.out.print("Original Array: ");
        displayArray(array);
        moveNegativesToBeginning(array);
        System.out.print("Modified Array: ");
        displayArray(array);
    }

    static void moveNegativesToBeginning(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            if (arr[i] < 0) {
                i++;
            } else if (arr[j] >= 0) {
                j--;
            } else {
                // Swap negative at j with positive at i
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }

    static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}