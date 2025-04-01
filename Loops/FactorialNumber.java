package Loops;
import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter the number ");
        int n = sc.nextInt();
        int product = 1;
        for(int i = 2;i<=n;i++){
            product *= i;
        }
        System.out.println(product);
    }
}
