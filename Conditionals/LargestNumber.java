package Conditionals;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number");
        int a = sc.nextInt();
        System.out.print("Enter second number");
        int b = sc.nextInt();
        System.out.print("Enter third number");
        int c = sc.nextInt();
        if (a>b && a>c){
            System.out.print(a+"first number is larger");
        } else if (b>a && b>c) {
            System.out.print(b+"second number  is larger");
        }
        else {
            System.out.println(c+"third number is larger");
        }
    }
}
