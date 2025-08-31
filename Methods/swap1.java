package Methods;
import java.util.Scanner;
public class swap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping");
        System.out.println(a + " " + b);
        int temp = a; //a = a+b
        a = b;        //b = a-b
        b = temp;     //a = a-b
        System.out.println("After swapping");
        System.out.println(a + " " + b);
    }
}