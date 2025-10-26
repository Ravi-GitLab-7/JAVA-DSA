package Recursion.Preactice;
import java.util.Scanner;
public class PowerOfTwoReturn {
    public static boolean isPowerOfTwo(int n){
        if(n==0) return false;  // 0 is not power of two
        if(n==1) return false;  // 1 is the power of two 2'0=1
        if(n%2 != 0) return false;
        return isPowerOfTwo(n/2);
    }PowerOfTwoReturn
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        if(isPowerOfTwo(n))
            System.out.print(n+" It is power of 2");
        else
            System.out.print(n+" It is power of 2");
    }
}
