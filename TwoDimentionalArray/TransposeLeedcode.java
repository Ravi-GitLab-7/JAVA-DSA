package TwoDimentionalArray;

public class TransposeLeedcode {
    public static void main(String[] args) {
        int[][] arr = {{2, 4, 1}, {-10, 5, 11}, {18, -7, 6}};
        int m = arr.length, n = arr[0].length;
        int[][] transpose = new int[n][m];

        // Compute the transpose
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        // Print the transposed matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}