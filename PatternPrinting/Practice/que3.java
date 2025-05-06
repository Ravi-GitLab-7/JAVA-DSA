package PatternPrinting.Practice;

import java.util.Scanner;

public class que3 {
    public static void printPattern(int n){
        int total = n * (n + 1) / 2;
        int current = total;

        for (int i = 1; i <= n; i++) {
            int count = n - i + 1;
            int start = current - count + 1;

            for (int j = 0; j < count; j++) {
                System.out.print((start + j) + " ");
            }

            current -= count;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
}
