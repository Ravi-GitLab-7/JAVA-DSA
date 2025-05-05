package PatternPrinting.Practice;

import java.util.Scanner;

public class AlphabereAquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of square");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char)(j+64) +" ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
