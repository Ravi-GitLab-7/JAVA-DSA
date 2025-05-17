package Array;
public class Sum {
    public static void main(String[] args) {
        int []arr = {23, 24, 25, 25, 27};
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) { // Change the condition to i < n
            sum += arr[i];
        }
        System.out.println(sum);
    }
}