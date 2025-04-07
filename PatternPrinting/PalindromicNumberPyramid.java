package PatternPrinting;
import java.util.Scanner;
public class PalindromicNumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        int nsp= n-1;
        int noa = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=nsp ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=noa ; j++) {
                System.out.print(j+" " );
            }
            nsp --;
            noa +=2;
            System.out.println();
        }
    }
}
