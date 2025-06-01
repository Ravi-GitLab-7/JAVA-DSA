package TwoDimentionalArray;

import java.util.Scanner;

public class SumOFelement {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int [][]arr = new int [2][2];
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <2 ; j++) {
                arr[i][j] = Sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <2 ; j++) {
               sum += arr[i][j];
            }
        }
        System.out.print(sum);
    }
}
