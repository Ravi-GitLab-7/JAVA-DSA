package Arrays;

public class Reverse_array {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] reverse = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            reverse[i] = original[original.length - 1 - i];
        }

        for (int num : reverse) {
            System.out.print(num + " ");
        }
    }
}
