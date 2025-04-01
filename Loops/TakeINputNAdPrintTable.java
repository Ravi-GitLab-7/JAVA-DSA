package Loops;
import java.util.Scanner;
public class TakeINputNAdPrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you wants to find table");
        int num = sc.nextInt();
        System.out.print("Enter the items for printing");
        int item = sc.nextInt();
        for (int i =1;i<=item;i++)
            System.out.println(num + " * " + i +"="+(num*i));
    }
}
