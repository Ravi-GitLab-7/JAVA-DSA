package TwoDimentionalArray;

public class WavePrintStaretFrom {
    public static void print(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print(arr);

        // Wave form of matrix --> column-wise (alternate)
        int m = arr.length, n = arr[0].length;
        for (int j = n - 1; j >= 0; j--) { // Outer loop over columns
            if (j % 2 == 0) { // If column index is even, traverse row-wise down
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else { // If column index is odd, traverse row-wise up
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}