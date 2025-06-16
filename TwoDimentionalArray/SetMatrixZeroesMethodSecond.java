package TwoDimentionalArray;
public class SetMatrixZeroesMethodSecond {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 0, 16},
        };

        int m = arr.length, n = arr[0].length;
        boolean[] row = new boolean[m];
        boolean[] coln = new boolean[n];

        // Mark the rows and columns where 0s are present
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    row[i] = true;
                    coln[j] = true;
                }
            }
        }

        // Set the rows to 0
        for (int i = 0; i < m; i++) {
            if (row[i]) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        // Set the columns to 0
        for (int j = 0; j < n; j++) {
            if (coln[j]) {
                for (int i = 0; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }

        // Print final matrix
        for (int[] row1 : arr) {
            for (int element : row1) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
