package Conditionals;
import java.util.Scanner;
public class divisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        if (n%5==0){
            System.out.println("Given number is divisible by 5");
        }
        else System.out.println("Given number is not divisible by 5");
    }
}
