package String;
import java.util.Scanner;
public class returnNumberOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        String s = "";
        s += n;
        System.out.println(s.length());

        //built in method
        System.out.println(Integer.toString(n).length());
    }
}

