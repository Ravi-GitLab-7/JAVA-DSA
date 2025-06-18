package TwoDimentionalArray.Practice;
public class DiagonalElements {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println("Main Diagonal Elements:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
    }
}
