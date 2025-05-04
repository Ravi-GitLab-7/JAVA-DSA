package Conditionals.Practice;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the cost price");
        int cp = sc.nextInt();
        System.out.print("Enter the selling price");
        int sp = sc.nextInt();

        if(cp<sp)
            System.out.println("Profit "+(sp-cp));
        if(cp>sp)
            System.out.println("Loss "+(cp-sp));
        if(cp==sp)
            System.out.println("Not profit not loss");

    }

}
