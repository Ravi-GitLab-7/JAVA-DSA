package TwoDimentionalArray;
public class WavePrintStaretFromALternateofrowwise {
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

        // Wave form of matrix --> columns-wise (Alternate)
        int m = arr.length, n = arr[0].length;
        for (int j = n - 1; j >= 0; j--) { // outer loop over columns
            if (j % 2 == 0) { // if column index is even, traverse row-wise down
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else { // if column index is odd, traverse row-wise up
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}