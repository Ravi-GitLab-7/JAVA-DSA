package Conditionals;
import java.util.Scanner;
public class AbsoluteValueAllTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (integer or decimal): ");
        double num = sc.nextDouble();  // Accepts both int and float

        if (num < 0) {
            num = -num;
        }

        System.out.println("The absolute value is: " + num);

        sc.close();
    }
}
