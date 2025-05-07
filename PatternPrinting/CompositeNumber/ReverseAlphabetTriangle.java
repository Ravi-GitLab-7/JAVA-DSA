package PatternPrinting.CompositeNumber;
import java.util.Scanner;
public class ReverseAlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // Print  spaces
            for (int s = 0; s < i; s++) {
                System.out.print(" "+" ");
            }

            // Print increasing numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j+" ");
            }

            // Print decreasing numbers
            for (int j = n - i - 1; j >= 1; j--) {
                System.out.print(j+" ");
            }

            // Move to next line
            System.out.println();
        }
    }
}