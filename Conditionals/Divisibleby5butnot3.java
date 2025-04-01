package Conditionals;
import java.util.Scanner;
public class Divisibleby5butnot3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("integer number");
        int n = sc.nextInt();
        if (n%5==0 && n%3!=0){
            System.out.println("This number is divisible by 5 but not 3");
        }
        else {
            System.out.println("This is  divisible by both 5 or 3");
        }
    }
}
