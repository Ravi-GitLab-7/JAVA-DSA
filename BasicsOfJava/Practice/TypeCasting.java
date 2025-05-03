package BasicsOfJava.Practice;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        double y = (double) x;
//        System.out.println(y/2);
        double y =sc.nextDouble();
        int x = (int)y;
        System.out.println(x);
    }
}
