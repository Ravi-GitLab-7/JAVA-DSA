package Methods;
import java.util.Scanner;

public class FActorialNumber {
    public static int fact(int x) {
        int xFact = 1;
        for (int i = 1; i <= x; i++) {
            xFact *= i;
        }
        return xFact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = fact(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
