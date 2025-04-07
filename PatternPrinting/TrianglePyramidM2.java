package PatternPrinting;

import java.util.Scanner;

public class TrianglePyramidM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter N");
        int n = sc.nextInt();
        int nsp = n-1, nst = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=nsp ; j++) {   //spaces
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=nst ; j++) {  // star
                System.out.print("*"+" ");
            }
            nsp --;
            nst += 2;
            System.out.println();
        }
    }
}

