package PatternPrinting.CompositeNumber;

import java.util.Scanner;

public class StarPyramidMTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();

        int nsp = n-1;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=nsp; j++) {
                System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*"+" ");
            }
            System.out.println(); // Move to the next line after each row
            nsp --;
            nst +=2;
        }
    }
}