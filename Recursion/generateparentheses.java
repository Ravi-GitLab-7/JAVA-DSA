package Recursion;
import java.util.Scanner;
public class generateparentheses {
    public static void print(int open, int close,int n ,String ans){
        if(ans.length()==2*n){
            System.out.println(ans);
            return;
        }
        if(open<n) print(open+1,close,n,ans+"(");
        if(close<open) print(open,close+1,n,ans+")");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        print(0,0,n,"");
    }
}
