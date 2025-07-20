package String;
public class equals {
    public static void main(String[] args) {
        String a = "abcdxyz";
        String b = "abcdxyz";
        String c = new String(a); // create new String object
        String d = "abc";
        d += "xyz";  // creates a new String

        System.out.println(a == b);      // true, both point to same string in the string pool
        System.out.println(a == c);      // false, c is a new object
        System.out.println(a == d);      // false, d is created at runtime
        System.out.println(a.equals(d)); // true, content is same
    }
}
