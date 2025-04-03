package PatternPrinting;
import java.util.Scanner;
public class UltaAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N ");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print((char) (j+64)+" ");
            }
            System.out.println();
        }
    }
}
