package Conditionals;
import java.util.Scanner;
public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number ");
        int n = sc.nextInt();
        if (n>99 && n<1000){
            System.out.println("This number is three digit");
        }
        else {
            System.out.println("This is not three digit number");
        }
    }
}
