package String;
import java.util.Scanner;
public class converIntoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        String s = "Ravi";
        s += n;
        System.out.println(s);
    }
}
