import java.util.Scanner;

public class CountDigitAndSquareIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("Square of the number is: " + square(n));
        System.out.println("Number of digits is: " + countDigits(n));
    }

    public static int square(int x) {
        return x * x;
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
