package PatternPrinting.Practice;

import java.util.Scanner;

public class FloydsTriangle {
    public static void printPattern(int n){
        int a = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(a++ +" ");
//                a++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
}
