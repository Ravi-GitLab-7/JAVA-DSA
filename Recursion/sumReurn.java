package Recursion;
import java.util.Scanner;
public class sumReurn {
        public static int sum(int n){
            if(n==1) return 1;  // base case
            int ans = n + sum(n - 1); // recursive call
            return ans;
        }
        public static void main(String[] args) {
            Scanner Sc = new Scanner(System.in);
            System.out.print("Enter the n: ");
            int n = Sc.nextInt();
            System.out.println(sum(n));
        }
}
