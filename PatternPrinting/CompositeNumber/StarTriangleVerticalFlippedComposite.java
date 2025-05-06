package PatternPrinting.CompositeNumber;

import java.util.Scanner;

public class StarTriangleVerticalFlippedComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}