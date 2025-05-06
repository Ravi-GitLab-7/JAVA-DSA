package PatternPrinting.Practice;

import java.util.Scanner;

public class special {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of square");
        int n = sc.nextInt();

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(2*j-1+" ");
//            }
//            System.out.println(); // Move to the next line after each row
//        }


        for (int i = 1; i <=n ; i++) {
            int a = 1;
            for (int j = 1; j <=i ; j++) {
                System.out.print(a +" ");
                a +=2 ;
            }
            System.out.println();
        }
    }
}