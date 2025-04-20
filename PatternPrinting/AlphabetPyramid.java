package PatternPrinting;

import java.util.Scanner;

public class AlphabetPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter N");
        int n =  sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {   //spaces
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {  // number
                System.out.print((char) (j+64) +" ");
            }
            System.out.println();
        }
    }
}


