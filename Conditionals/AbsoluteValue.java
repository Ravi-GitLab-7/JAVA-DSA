package Conditionals;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer");
        int n = sc.nextInt();
        if(n<0){
            n = n* (-1);
        }
        System.out.println("the absolute number is :"+n);
    }
}
