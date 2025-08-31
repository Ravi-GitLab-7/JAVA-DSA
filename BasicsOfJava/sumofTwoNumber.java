package BasicsOfJava.Practice;
import java.util.Scanner;
public class sumofTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");

        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}
