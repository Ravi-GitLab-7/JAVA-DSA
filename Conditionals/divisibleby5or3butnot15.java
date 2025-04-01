package Conditionals;
import java.util.Scanner;
public class divisibleby5or3butnot15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
//        if (n%5==0 || n%3==0){
//            if (n%15 != 0){
//                System.out.println("given number is divisible by 5 or 3 but not 15");
//            }
//            else {
//                System.out.println("not divisible");
//            }
//        }
//        else {
//            System.out.println("not divisible");
//        }
        if (n%5==0 ||n%3==0 && n%15 != 0){
            System.out.println("given number is divisible by 5 or 3 but not 15"); // && >priority than ||
        }
        else{
            System.out.println("not divisible");
        }
    }
}
