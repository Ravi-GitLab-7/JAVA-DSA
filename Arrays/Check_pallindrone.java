package Arrays;
import java.util.Scanner;

public class Check_pallindrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, c, r, s = 0;

        System.out.println("Enter any number:");
        n = sc.nextInt();
        c = n;  // store the original number

        while (n > 0) {
            r = n % 10;
            s = (s * 10) + r;
            n /= 10;
        }

        if (c == s) {
            System.out.println(c + " is a palindrome.");
        } else {
            System.out.println(c + " is not a palindrome.");
        }
    }
}
