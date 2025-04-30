package Arrays;

public class FindDuplicatesInPlace {

    public static void printDuplicates(int[] arr) {
        System.out.print("Duplicate elements: ");
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]);
            if (arr[index] >= 0) {
                arr[index] = -arr[index]; // Mark as visited
            } else {
                System.out.print(index + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 3, 6, 6};
        printDuplicates(array);
    }
}
