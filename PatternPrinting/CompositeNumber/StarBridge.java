package PatternPrinting.CompositeNumber;

import java.util.Scanner;

public class StarBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();

        for (int i = 1; i <=2*n-1 ; i++) {  //print above star
            System.out.print("*"+" ");
        }
        System.out.println();
        n--;

        for (int i = 1; i <= n; i++) { //print 1st star
            for (int j = 1; j <=n+1-i; j++) {
                System.out.print("*"+" ");
            }
            for(int j=1;j<=2*i-1;j++){  //print apacs
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=n+1-i; j++) { //print 2nd star
                System.out.print("*"+" ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}