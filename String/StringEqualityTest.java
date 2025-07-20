package String;
public class StringEqualityTest {
    public static void main(String[] args) {
        String a = "abcdxyz";
        String b = "abcdxyz";
        String c = new String(a); // creates new String object
        String d = "abc";
        d = d + "xyz";  // creates a new String

        System.out.println(a == b);      // true
        System.out.println(a == c);      // false
        System.out.println(a == d);      // false
        System.out.println(a.equals(d)); // true
    }
}
