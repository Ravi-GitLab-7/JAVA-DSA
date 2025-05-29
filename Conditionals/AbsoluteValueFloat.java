package Conditionals;
import java.util.Scanner;
public class AbsoluteValueFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (integer or decimal): ");
        double num = sc.nextDouble();

        double absolute = Math.abs(num);
        System.out.println("The absolute value is: " + absolute);

        sc.close();
    }
}
