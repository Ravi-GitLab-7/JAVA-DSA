package Recursion;
import java.util.Scanner;
public class print1ToN {
    static int n;
    public static void print(int x ){
        if(x>n) return;  // base case
        System.out.println(x);   // work
        print(x+1);  //call
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        n = Sc.nextInt();
        print(1);
    }
}
