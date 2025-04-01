package Conditionals;
import java.util.Scanner;
public class HowMuchAreaGraterThanPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle");
        int Length = sc.nextInt();
        System.out.print("Enter the Breath of rectangle");
        int Breath = sc.nextInt();
        int area = Length * Breath;
        System.out.println("Area of Rectangle is :"+area);
        int perimeter = 2 * (Length + Breath);
        System.out.println("The perimeter is :"+perimeter);
        if (area > perimeter){
            System.out.print("area is greater than perimeter by :");
            System.out.println(area-perimeter);
        }
        else if (Length == Breath){
            System.out.println("it is a square ");
        }
    }
}
