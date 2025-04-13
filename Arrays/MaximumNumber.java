package Arrays;

public class MaximumNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8};
        int max = 2;  //if take -1 then ot not run proper

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum number is: " + max);
    }
}
