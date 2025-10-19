package Recursion;
import java.util.Scanner;
public class sumFrom1toN {
    public static void sum(int n,int s){
        if(n==0){  //base case
            System.out.println(s);
            return;
        }
       sum(n-1,s+n);  //call and work
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = Sc.nextInt();
        sum(n,0);
    }
}
