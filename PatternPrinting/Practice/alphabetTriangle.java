package PatternPrinting.Practice;
import java.util.Scanner;
public class alphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
