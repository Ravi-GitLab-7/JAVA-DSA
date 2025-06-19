package TwoDimentionalArray;

public class ZigZagTraversal {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12},
                {13,14, 15, 16}
        };

        int rows = matrix.length;

        System.out.println("Zig-Zag Traversal:");
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // left to right
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                // right to left
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}

