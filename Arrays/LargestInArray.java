package Arrays;

public class LargestInArray {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 89, 34};  // Sample array

        int max = numbers[0]; // Assume first element is max

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if current is greater
            }
        }

        System.out.println("The largest element is: " + max);
    }
}

