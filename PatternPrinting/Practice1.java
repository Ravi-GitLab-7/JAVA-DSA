package PatternPrinting;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int nst = 1;      // number of stars
        int nsp = n - 1;  // number of spaces

        for (int i = 1; i <= n; i++) {
            // Print star
            for (int j = 1; j <= nst; j++) {
                System.out.print("*  "); // two star for alignment
            }

            // Print space
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            // Update counters
            nst += 1;
            nsp -= 1;
            // Move to next line
            System.out.println();
        }
        nst = n-1;
        nsp = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= nst; j++) {
                System.out.print("*  ");
            }

            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            nst -= 1;
            nsp += 1;
            System.out.println();
        }
    }
}
