package TwoDimentionalArray.Practice;
public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] rowFlag = new boolean[rows];
        boolean[] colFlag = new boolean[cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (matrix[i][j] == 0) {
                    rowFlag[i] = true;
                    colFlag[j] = true;
                }

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (rowFlag[i] || colFlag[j])
                    matrix[i][j] = 0;

        System.out.println("Matrix after setting zeroes:");
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
