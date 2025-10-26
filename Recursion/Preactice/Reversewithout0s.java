package Recursion.Preactice;
import java.util.Scanner;
public class Reversewithout0s {
    public static int reverseNumber(int n, int rev) {
        if (n == 0)
            return rev;
        rev = rev * 10 + (n % 10);
        return reverseNumber(n / 10, rev);  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int reversed = reverseNumber(n, 0);
        System.out.println("Reversed number is: " + reversed);
    }
}
