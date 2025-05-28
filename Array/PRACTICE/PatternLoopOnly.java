package Array.PRACTICE;

import java.util.Scanner;

public class PatternLoopOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input1: ");
        int n = sc.nextInt();
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print((n - min) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
