package Conditionals;
import java.util.Scanner;
public class DivisibleBy5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("integer number");
        int n = sc.nextInt();
        if (n%5==0 && n%3==0){  // && = both condition is true = logical and
            System.out.println("This number is divisible by both 5 and 3");
        }
        else {
            System.out.println("This is not divisible by 5 or 3");
        }
    }
}
