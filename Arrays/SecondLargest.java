package Arrays;

public class SecondLargest {

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements might be equal).");
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 8, 20, 3};

        int result = findSecondLargest(numbers);
        if (result != -1) {
            System.out.println("Second largest element is: " + result);
        }
    }
}

