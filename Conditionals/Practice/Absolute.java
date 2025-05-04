package Conditionals.Practice;

import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        if(n<0){
            n *= -1;
        }
        System.out.println(n);
    }

}
