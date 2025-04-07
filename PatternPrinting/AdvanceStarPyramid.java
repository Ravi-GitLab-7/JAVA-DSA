package PatternPrinting;

import java.util.Scanner;

public class AdvanceStarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter N");
        int n = sc.nextInt();
        int nsp = n-1, nst = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=nsp ; j++) {   // star
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=nst ; j++) { // space
                System.out.print("*"+" ");
            }
            nst +=2;
            nsp --;
            System.out.println();
        }

        nsp = 1;
        nst = 2*n-3;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=nsp ; j++) {   // space
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=nst ; j++) { // star
                System.out.print("*"+" ");
            }
            nst -= 2;
            nsp ++;
            System.out.println();
        }
    }
}

