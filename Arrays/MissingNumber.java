package Arrays;

public class MissingNumber {

    public static int findMissingNumber(int[] arr, int n) {
        int sum = n * (n + 1) / 2;
        int arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        return sum - arrSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int n = 8;  // N is the range, in this case, from 1 to 8
        System.out.println("Missing number: " + findMissingNumber(arr, n));
    }
}
