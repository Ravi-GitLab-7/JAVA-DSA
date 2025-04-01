package javaInput;
import java.util.Scanner;  // Correct import statement

public class areaofCircleInput {  // Class names should start with an uppercase letter
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Correct Scanner initialization

        System.out.print("Enter radius:");
        int radius = sc.nextInt();  // Corrected variable name

        double pi = 3.14;
        double area = pi * radius * radius;

        System.out.println("The area of the circle is: " + area);
    }
}
