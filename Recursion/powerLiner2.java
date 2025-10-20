package Recursion;
import java.util.Scanner;
public class powerLiner2 {
    public static int pow(int a,int b){
        if(b==0) return 1;
        return a * pow(a,b-1);  // Time Complexity = o(b)
    }
    public static int pow2(int a,int b){
        if(b == 0) return 1;
        int ans = pow2(a , b/2);
        if(b % 2 == 0) return ans * ans;
        else return ans * ans * 2;   // Time Complexity = o(log b)
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int a = Sc.nextInt();
        System.out.print("Enter the power: ");
        int b = Sc.nextInt();
        System.out.println(a+" Raised to the power "+ b +" is :"+pow2(a,b));
    }
}
