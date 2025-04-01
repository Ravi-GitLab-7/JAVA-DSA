package Conditionals;
import java.util.Scanner;
public class ifCordinateliesOnOrigin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of x");
        int x = sc.nextInt();
        System.out.println("enter the number of y");
        int y = sc.nextInt();
        if (x==0 && y==0){
            System.out.println("the par is origin");
        } else if (x == 0) {
            System.out.println("the point is lies on y-axis");
        } else if (y ==0) {
            System.out.println("the point is lies on x-axis");
        }
        else {
            System.out.println("not lies anywhere");
        }
    }
}
