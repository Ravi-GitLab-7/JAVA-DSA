package Recursion;
import java.util.Scanner;
public class print1ToN {
//    static int n;
    public static void print(int x,int n  ){
        if(x>n) return;  // base case
        System.out.println(x);   // work  1,2,3,4,5
        print(x+1,n);  //call
//        System.out.println(x);   // work  5,4,3,2,1
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = Sc.nextInt();
        print(1,n);
    }
}
