package Recursion;
import java.util.Scanner;
public class printNto1 {
    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = Sc.nextInt();
        print(n);
    }
}
