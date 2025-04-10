package Methods;
import java.util.Scanner;
public class CheckEvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Chknum(n);
    }
    public static void Chknum(int n){
        if(n%2==0) System.out.println("even");
        else System.out.println("odd");
    }
}
