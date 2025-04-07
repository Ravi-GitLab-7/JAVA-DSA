package PatternPrinting;
import java.util.Scanner;

public class Prtc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int nst1 = 1;          // For left pattern stars
        int nsp1 = n - 1;      // For left pattern spaces (after stars)

        int nst2 = 1;          // For right pattern stars
        int nsp2 = n - 1;      // For right pattern spaces (before stars)

        for (int i = 1; i <= n; i++) {
            // Left Pattern
            for (int j = 1; j <= nst1; j++) {
                System.out.print("*  ");
            }
            for (int j = 1; j <= nsp1; j++) {
                System.out.print("   "); // space to match the "*  "
            }

            // Right Pattern
            for (int j = 1; j <= nsp2; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst2; j++) {
                System.out.print("* ");
            }

            // Update counters
            nst1++;
            nsp1--;

            nst2++;
            nsp2--;

            System.out.println();
        }
        //REVERSE
        int nsp3 = 1;          // For left pattern stars
        int nst3 = n - 1;      // For left pattern spaces (after stars)

        int nst4 = n-1;          // For right pattern stars
        int nsp4 = 1;      // For right pattern spaces (before stars)

        for (int i = 1; i <= n; i++) {
            // Left Pattern
            for (int j = 1; j <= nst3; j++) {
                System.out.print("*  ");
            }
            for (int j = 1; j <= nsp3; j++) {
                System.out.print("   "); // space to match the "*  "
            }

            // Right Pattern
            for (int j = 1; j <= nsp4; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst4; j++) {
                System.out.print("* ");
            }

            // Update counters
            nst3--;
            nsp3++;

            nst4--;
            nsp4++;

            System.out.println();
        }
    }
}
