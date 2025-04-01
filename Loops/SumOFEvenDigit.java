package Loops;
import java.util.Scanner;
public class SumOFEvenDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            int lastDigit = n%10;
            if(lastDigit%2==0){
                sum += lastDigit;
            }
            n /= 10;
        }
        System.out.println(sum);
    }
}
