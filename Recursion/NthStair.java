package Recursion;
import java.util.Scanner;
public class NthStair {
    public static int stair(int n){
        if(n<=2) return n;  // base case
        return stair(n-1) + stair(n-2);  //work or recurrence
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = Sc.nextInt();
        System.out.println(stair(n));
    }
}
