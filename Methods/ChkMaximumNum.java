package Methods;
import java.util.Scanner;
public class ChkMaximumNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(Math.max(a,Math.max(b,c)));
    }
}
