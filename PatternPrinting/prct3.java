package PatternPrinting;

import java.util.Scanner;

public class prct3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N");
        int n = sc.nextInt();
        int nsp = n - 1, nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {   // star
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) { // space
                System.out.print("*" + " ");
            }
            nst += 2;
            nsp--;
            System.out.println();
        }
            //reverse
        int nsp2 =n-2;
        int nst2 =n=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=nsp2 ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=nst2 ; j++) {
                System.out.print("* ");
            }
            nsp2 --;
            nst2 ++;
            System.out.println();
        }
    }
    }
