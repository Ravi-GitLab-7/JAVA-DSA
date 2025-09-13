package binarySearch;
import java.util.Scanner;
public class sqrTihoutInbuildFunction {
    public static int mySqrt(int n ){
//         return (int)(Math.sqrt(n));   //Newton Raphson method it is faster then binary search
        if(n<=1) return n;
        int lo = 0,hi =n;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            if(mid>n/mid) hi = mid-1;  // n/m take insted of original bianry number code
            else lo = mid+1;
        }
        return hi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive number : ");
        int n = sc.nextInt();
        int sqr = mySqrt(n);
        System.out.println("Squre root of given Number is : "+ sqr);
    }
}
