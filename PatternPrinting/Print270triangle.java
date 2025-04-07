package PatternPrinting;

import java.util.Scanner;

public class Print270triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter N");
        int n = sc.nextInt();
        int nsp = 1, nst = n;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=nsp ; j++) {   // star
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=nst ; j++) { // space
                System.out.print("*"+" ");
            }
            nst --;
            nsp += 1;
            System.out.println();
        }
    }
}

