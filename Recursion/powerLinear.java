package Recursion;
import java.util.Scanner;
public class powerLinear {
    public static int pow(int a,int b){
        if(a==0 && b==0){
            System.out.println("Not Defined");
            return -1;
        }
        if(b==0) return 1;
        return a * pow(a,b-1);
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int a = Sc.nextInt();
        System.out.print("Enter the power: ");
        int b = Sc.nextInt();
        System.out.println(a+" Raised to the power "+ b +" is :"+pow(a,b));
    }
}
