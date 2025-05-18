package Array;

public class PassingArrayMethod {
    public static void change(int[] arr) { // Made the method static
        arr[0] = 100;
    }

    public static void main(String[] args) {
        int[] arr = {23, 34, 45, 67, 23, 34};
        System.out.println(arr[0]); // Output: 23
        change(arr); // Static method call
        System.out.println(arr[0]); // Output: 100
    }
}