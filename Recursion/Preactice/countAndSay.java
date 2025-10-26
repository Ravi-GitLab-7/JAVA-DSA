package Recursion.Preactice;
import java.util.Scanner;
public class countAndSay {
    // Method to generate Count and Say sequence
    public String countAndSay(int n) {
        // Base case
        if (n == 1)
            return "1";
        // Recursive call for previous term
        String s = countAndSay(n - 1) + "@"; // dummy char to mark end
        String ans = "";
        int i = 0, j = 0;
        // Process the previous term
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            } else {
                int len = j - i;      // count of repeating digits
                ans += len;           // add count
                ans += s.charAt(i);   // add digit
                i = j;                // move pointer
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // Create object of class countAndSay
        countAndSay obj = new countAndSay();
        System.out.println("Count and Say sequence for n = "+n+ " is: " + obj.countAndSay(n));
    }
}
