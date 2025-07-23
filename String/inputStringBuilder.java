package String;
import java.util.Scanner;
public class inputStringBuilder {
    public static void main(String[] args) {
        System.out.print("Enter the string:");
          Scanner sc  = new Scanner(System.in);
          StringBuilder sb = new StringBuilder(sc.nextLine());
          System.out.println(sb);
          sb.setCharAt(0,'a');
          System.out.print(sb);
    }
}
