package String;
import java.util.Arrays;
public class validAnagram {
    public static void main(String[] args) {
        String s = "ravi";
        String t = "ivra";

        if (s.length() != t.length()) {
            System.out.println("Not Anagram");
            return;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean isAnagram = true;
        for (int i = 0; i < s.length(); i++) {
            if (a[i] != b[i]) { //Compare correct elements
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) System.out.println("Valid Anagram");
        else System.out.println("Not Anagram");
    }
}
