package PatternPrinting;
import java.util.Scanner;
public class NumberTriangleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter N");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {   //spaces
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=i ; j++) {  // number
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

