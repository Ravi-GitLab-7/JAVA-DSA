package Methods;

public class DoubleArray {

    // Function to double each element in the array
    public static void doubleElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }

    public static void main(String[] args) {
        // Original array
        int[] numbers = {1, 4, 7, 10};

        // Call the function
        doubleElements(numbers);

        // Print the updated array
        System.out.print("Doubled Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

