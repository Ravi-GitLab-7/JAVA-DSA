package TwoDimentionalArray.Practice;
public class SearchBottomToTopMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17},
                {18, 21, 23, 26}
        };

        int m = arr.length, n = arr[0].length;
        int target = 14;

        int i = m - 1, j = 0; // Start from bottom-left

        while (i >= 0 && j < n) {
            if (arr[i][j] == target) {
                System.out.println("Found at row " + i + ", column " + j);
                return;
            } else if (arr[i][j] > target) {
                i--; // Move up
            } else {
                j++; // Move right
            }
        }

        System.out.println("Target not found in the matrix");
    }
}