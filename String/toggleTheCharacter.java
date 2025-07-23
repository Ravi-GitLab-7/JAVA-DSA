package String;
import java.util.Scanner;
public class toggleTheCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        for(int i = 0;i<n;i++){
            char ch = sb.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 65 && ascii <= 90) {
                ascii += 32;
//                ch = (char) ascii;
//                sb.setCharAt(i, ch);
            }
            else if (ascii >= 97 && ascii <= 122) {
                ascii -= 32;
//                ch = (char) ascii;
//                sb.setCharAt(i, ch);
            }
            ch = (char) ascii;
            sb.setCharAt(i, ch);
        }
        System.out.print(sb);
    }
}
