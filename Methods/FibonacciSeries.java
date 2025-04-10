package Methods;
import java.util.Scanner;

public class FibonacciSeries {
    public static void Fibonacci(int n) {
        int a = 0, b = 1, next;
        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int terms = sc.nextInt();
        Fibonacci(terms);
    }
}
