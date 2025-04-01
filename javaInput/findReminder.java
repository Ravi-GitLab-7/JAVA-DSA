package javaInput;
import java.util.Scanner;
public class findReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number ");
        int a = sc.nextInt();
        System.out.print("Enter the second number ");
        int b = sc.nextInt();
        int r = a%b;
        System.out.println("The reminder is :"+r);
    }
}
