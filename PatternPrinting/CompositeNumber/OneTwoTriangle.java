package PatternPrinting.CompositeNumber;
import java.util.*;

public class OneTwoTriangle {
    public static void main(String[] args) {
        int i, j;
        int n = 5; // You can change this value as needed

        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {

            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {

                // printing column values up to the row value
                System.out.print(j + " ");
            }

            // print new line for each row
            System.out.println();
        }
    }
}
