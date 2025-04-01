package Conditionals;
import java.util.Scanner;
public class youngerAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of Ram");
        int a = sc.nextInt();
        System.out.print("Enter the age of Shyam");
        int b = sc.nextInt();
        System.out.print("Enter the age of Mohan");
        int c = sc.nextInt();
        if (a>b){
            if (a>c){
                System.out.println(a+"is the greater number");
            }
            else {
                System.out.println(c+"is hte greater number");
            }
        }
        else {
            if (b>c){
                System.out.println(b+"is the greater number");
            }
            else {
                System.out.println(c +"is the greater number");
            }
        }
    }
}
