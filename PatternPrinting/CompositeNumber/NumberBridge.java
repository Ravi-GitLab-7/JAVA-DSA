package PatternPrinting.CompositeNumber;

import java.util.Scanner;

public class NumberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();

        for (int i = 1; i <=2*n-1 ; i++) {  //print above star
            System.out.print(i+" ");
        }
        System.out.println();
        n--;
        int nsp =1;
        for (int i = 1; i <= n; i++) { //print 1st star
            int a = 1;
            for (int j = 1; j <=n+1-i; j++) {
                System.out.print(a++ +" ");
            }
            for(int j=1;j<=nsp;j++){  //print apacs
                System.out.print(" "+" ");
                a ++;
//                a ++;
            }
            nsp +=2;
            for (int j = 5; j <=n+5-i; j++) { //print 2nd star
                System.out.print(a++ +" ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}