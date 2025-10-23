package Recursion;
import java.util.Scanner;
public class printStringdPermutation {
    public static void printString(String s ,int n){
        int m = s.length();
        if(m==n){
            System.out.println(s);
            return;
        }
        printString(s+"1",n); // for all posibilities output
        printString(s+"0",n);  // for all posibilities output
        if (m == 0 || s.charAt(m - 1) =='0'){
            printString(s+"1",n);
            printString(s+"0",n);
        }
        else
            printString(s+"0",n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        printString("",n);
    }
}
