package PatternPrinting;
import java.util.Scanner;
public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i == j || i + j == n+1)
                System.out.print("* ");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
