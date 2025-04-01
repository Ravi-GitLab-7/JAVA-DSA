package Conditionals;
import java.util.Scanner;
public class divisibleby3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        if (n%5==0){
            if (n%3==0){
                System.out.println("divisible by both 5 and 3");
            }
            else {
                System.out.println("not divisible");
            }
        }
        else {
            System.out.println("not divisible");
        }
    }
}
