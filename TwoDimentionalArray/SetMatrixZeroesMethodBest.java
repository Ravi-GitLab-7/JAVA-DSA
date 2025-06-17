package TwoDimentionalArray;
public class SetMatrixZeroesMethodBest {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5},
        };

        int m = arr.length, n = arr[0].length;
        boolean zeroRow = false, zeroColn = false;

        // check 0th row
        for (int j = 0; j < n; j++) {
            if (arr[0][j] == 0) {
                zeroRow = true;
                break;
            }
        }

        // check 0th column
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                zeroColn = true;
                break;
            }
        }

        // Traverse submatrix without going to 0th row and 0th col
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 0) {
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
            }
        }

        // traverse 0th row (set entire column if arr[0][j] == 0)
        for (int j = 1; j < n; j++) { // FIX: j < n instead of j < m
            if (arr[0][j] == 0) {
                for (int i = 1; i < m; i++) { // FIX: i < m instead of i < n
                    arr[i][j] = 0;
                }
            }
        }

        //traverse 0th column (set entire row if arr[i][0] == 0)
        for (int i = 1; i < m; i++) { // FIX: i < m instead of i < n
            if (arr[i][0] == 0) {
                for (int j = 1; j < n; j++) { // FIX: j < n instead of j < m
                    arr[i][j] = 0;
                }
            }
        }

        // If zeroRow is true, set 0th row to 0
        if (zeroRow == true) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }

        // If zeroColn is true, set 0th column to 0
        if (zeroColn == true) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
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
