package Conditionals;
import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost prize");
        int CP = sc.nextInt();
        System.out.print("Enter selling prize");
        int SP = sc.nextInt();
        if (CP<SP){
            System.out.println("We have gain profit is : ");
            System.out.println(SP - CP);
        }
        else {
            System.out.println("We occured loss :");
            System.out.println(CP - SP);
        }
    }
}
