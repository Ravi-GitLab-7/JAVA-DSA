package Conditionals;
import java.util.Scanner;
public class sideoftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number");
        int a = sc.nextInt();
        System.out.print("Enter second number");
        int b = sc.nextInt();
        System.out.print("Enter third number");
        int c = sc.nextInt();
        if (a+b>c && a+c>b && b+c>a){
            System.out.print("this side make a triangle");
        }
        else {
            System.out.println("Not make triangle");
        }
    }
}
