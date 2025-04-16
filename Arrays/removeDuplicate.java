package Arrays;

public class removeDuplicate {
//

    public class Remove_duplicate {
        public static void main(String[] args) {
            int[] arr = {1, 1, 2, 5, 2, 6, 6, 7, 9, 8, 6};
            int n = arr.length;
            int[] temp = new int[n];
            int newIndex = 0;

            for (int i = 0; i < n; i++) {
                boolean isDuplicate = false;
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    temp[newIndex++] = arr[i];
                }
            }

            System.out.print("After removing duplicates: ");
            for (int i = 0; i < newIndex; i++) {
                System.out.print(temp[i] + " ");
            }
        }
    }
}