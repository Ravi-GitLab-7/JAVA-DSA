package Loops;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter the number");
        int n = sc.nextInt();
           int rev = 0;
           int sum = 0;
           while(n!=0){
               int lastDigit = n%10;
               rev *= 10;
               rev += lastDigit;
               n /=10;
           }
            sum = n+ rev;
        System.out.println(rev);
        System.out.println("Sum is :"+sum);
    }
}
