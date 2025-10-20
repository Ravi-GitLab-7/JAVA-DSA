package Recursion;
import java.util.Scanner;
public class MazePath {
    public static int maze(int row,int coln,int m,int n){
        if(row == m || coln == n) return 1;
        int rightways = maze(row,coln+1,m,n);
        int downways = maze(row+1,coln,m,n);
        return rightways+downways;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int m = Sc.nextInt();
        System.out.print("Enter the coln: ");
        int n = Sc.nextInt();
        System.out.println(maze(1,1,m,n));
    }
}
