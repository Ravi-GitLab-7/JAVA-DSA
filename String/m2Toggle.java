package String;
import java.util.Scanner;
public class m2Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (Character.isUpperCase(ch)) {
                sb.setCharAt(i, Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                sb.setCharAt(i, Character.toUpperCase(ch));
            }
        }
        System.out.println(sb);
    }
}