package Loops;
import java.util.Scanner;
public class ApNthTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nnt term");
        int n = sc.nextInt();
//        for(int i=1;i<= 2*n-1;i +=2)
//            System.out.print(i+" ");
        //4,7,10,13,16,19
        int a = 4 ,d = 3;
        for (int i =1;i<=n;i++)
            System.out.print(a+" ");
        a +=d;
    }
}
