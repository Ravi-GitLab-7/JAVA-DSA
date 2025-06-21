package Loops;
import java.util.Scanner;
public class FactorailFirstNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            long fact = 1;
            for(int j = 1;j<=i;j++){
                fact *= j;
            }
            System.out.println(i+"! = "+fact);
        }
    }
}

