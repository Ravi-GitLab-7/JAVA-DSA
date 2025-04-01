package Loops;
import java.util.Scanner;
public class ProductOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        int product = 1;
        while(n!=0){
            int latsDigit = n%10;
            product *= latsDigit;
            n /= 10;
        }
        System.out.println(product);
    }
}
