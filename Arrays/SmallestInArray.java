package Arrays;

public class SmallestInArray {
    public static void main(String[] args) {
        int[] arr = {25, 11, 7, 75, 56};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Smallest element is: " + min);
    }
}
