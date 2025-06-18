package TwoDimentionalArray.Practice;
public class MaxRowSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int maxSum = Integer.MIN_VALUE;
        int rowIndex = -1;

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                rowIndex = i;
            }
        }

        System.out.println("Row with max sum: Row " + rowIndex + " (Sum = " + maxSum + ")");
    }
}
