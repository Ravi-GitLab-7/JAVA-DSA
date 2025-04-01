package Conditionals;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter years");
        int n = sc.nextInt();
        if (n%4==0){
            System.out.println("Given year is leap year");
        }
        else System.out.println("Given year is not leap year");
    }
}
