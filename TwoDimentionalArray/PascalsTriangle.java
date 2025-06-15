package TwoDimentionalArray;
import java.util.ArrayList;
import java.util.List;
public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 6; // Number of rows
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) { // j <= i to include all elements in the row
                if (j == 0 || j == i) { // Add 1 for the border elements
                    row.add(1);
                } else {
                    // Sum of two elements from the previous row
                    row.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                }
            }
            ans.add(row); // Add the current row to the triangle
        }

        // Print Pascal's Triangle
        for (List<Integer> row : ans) {
            for (Integer number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}