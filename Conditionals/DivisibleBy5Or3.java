package Conditionals;
import java.util.Scanner;
public class DivisibleBy5Or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a number");
        int n = sc.nextInt();
        if (n%5==0 || n%3==0){
            System.out.println("given number is divisible by  either 5 or 3");
        }
        else {
            System.out.println("given number is not divisible by  either 5 or 3");
        }
    }
}
