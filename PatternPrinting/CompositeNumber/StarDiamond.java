package PatternPrinting.CompositeNumber;

import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();

        int nsp = n-1;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=nsp; j++) {  //no fo spaces
                System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++){   //no of stars
                System.out.print("*"+" ");
            }
            System.out.println(); // Move to the next line after each row
            nsp --;
            nst +=2;
        }
        nsp = 1;
        nst = nst - 4;
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <=nsp; j++) {  //no fo spaces
                System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++){   //no of stars
                System.out.print("*"+" ");
            }
            System.out.println(); // Move to the next line after each row
            nsp ++;
            nst -=2;
        }
    }
}