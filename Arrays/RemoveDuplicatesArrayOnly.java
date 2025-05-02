package Arrays;

public class RemoveDuplicatesArrayOnly {

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n]; // to store unique values
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // check if arr[i] already exists in temp[0...count-1]
            for (int j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // if not found, add to temp
            if (!isDuplicate) {
                temp[count] = arr[i];
                count++;
            }
        }

        // copy unique elements to final result array of correct size
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 9, 4, 9, 1, 5};
        int[] unique = removeDuplicates(array);

        System.out.print("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.print("\nArray without duplicates: ");
        for (int num : unique) {
            System.out.print(num + " ");
        }
    }
}

