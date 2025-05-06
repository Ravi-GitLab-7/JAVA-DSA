package PatternPrinting.Practice;
import java.util.Scanner;
public class StarCross {
    public static void starFish(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i==j || i+j==n+1){
                    System.out.print("*"+" ");
                }
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        starFish(n);
        sc.close();
    }
}
