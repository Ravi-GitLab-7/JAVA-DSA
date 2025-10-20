package Recursion;
import java.util.Scanner;
public class NthStair2 {
    public static int stair(int n) {
        if (n == 1) return 1;
        if (n == 2) return 0;
        if (n == 3) return 2;
        return stair(n - 1) + stair(n - 3);
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = Sc.nextInt();
        System.out.println(stair(n));
        Sc.close();
    }
}