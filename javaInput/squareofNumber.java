package javaInput;
import java.util.*;
public class squareofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int x= sc.nextInt();
        int square = x*x;
        System.out.println("Square of number is :"+square);
    }
}
