package Conditionals;
import java.util.Scanner;
public class BehaviorOFGrade {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int n = Sc.nextInt();
        if (n>90){
            System.out.println("Excellent");
        } else if (n>80) {
            System.out.println("very good");
        } else if (n>50) {
            System.out.println("good");
        } else if (n<50) {
            System.out.println("not good");
        }
    }
}
