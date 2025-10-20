package Recursion;
import java.util.Scanner;
public class fibonacciNo {
    public static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = Sc.nextInt();
        System.out.println("Fibonacci Series is: "+fibo(n));
    }
}
