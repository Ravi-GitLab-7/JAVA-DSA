package Methods;
import java.util.Scanner;
public class ReturnSquareNumber {
    public static int square(int a){
        return a*a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        int x = square(a);
        System.out.println(square(a));
    }
}
