//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of square");
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n+1-i; j++) {
//                System.out.print(i+ " ");
//            }
//            System.out.println(); // Move to the next line after each row
//        }
//    }
//}
package PatternPrinting.Practice;

import java.util.Scanner;

public class que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of square");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) { // fix: use i >= 1
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close(); // Always good to close Scanner
    }
}
