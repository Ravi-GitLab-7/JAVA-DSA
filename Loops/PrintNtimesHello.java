package Loops;
import java.util.Scanner;
public class PrintNtimesHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of N");
        int n = sc.nextInt();
        for (int i= 0;i<=n;i++) System.out.println("Hello");
    }
}
