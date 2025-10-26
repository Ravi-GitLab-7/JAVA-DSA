package Recursion.Preactice;
import java.util.Scanner;
public class findWayStairs {
    public static int stair(int n){
        // base case
        if (n == 0) return 0;  // no stairs
        if (n == 1) return 1;  // 1 way: (1)
        if (n == 2) return 2;  // 2 ways: (1+1), (2)
        if (n == 3) return 4;  // 4 ways: (1+1+1), (1+2), (2+1), (3)
        return stair(n-1) + stair(n-2) + stair(n-3);  //work or recurrence
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = Sc.nextInt();
        System.out.println(stair(n));
    }
}
