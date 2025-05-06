package PatternPrinting.Practice;

import java.util.Scanner;

public class que1 {
        public static void printPattern(int n){
            for (int i = 1; i <=n ; i++) {
                int a =(i-1)*2;
                for (int j = 1; j <=i ; j++) {
                    System.out.print(a+" ");
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