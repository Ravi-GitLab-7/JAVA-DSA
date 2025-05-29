package Conditionals;
import java.util.Scanner;
public class AbsoluteValueUsingMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the integer: ");
        int n = sc.nextInt();

        int absolute = Math.abs(n);
        System.out.println("The absolute value is: " + absolute);

        sc.close();
    }
}
