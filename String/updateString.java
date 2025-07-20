package String;
import java.util.Scanner;
public class updateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        String t = " ";
        for (int i = 0; i <s.length() ; i++) {
            if(i%2==0) t +='a';
            else t += s.charAt(i);
        }
        System.out.print(t);
    }
}
