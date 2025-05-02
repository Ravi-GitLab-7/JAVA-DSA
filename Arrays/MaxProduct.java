package Arrays;

public class MaxProduct {

    public static int maxProduct(int[] arr) {
        int n = arr.length;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }

        return max1 * max2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 20, 3, 4, 5};
        System.out.println("Maximum product: " + maxProduct(arr));
    }
}

