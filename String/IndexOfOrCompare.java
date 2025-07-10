package String;

public class IndexOfOrCompare    {
    public static void main(String[] args) {
        String s = "Ravi Raj";
        System.out.println(s.indexOf('i'));
        System.out.println(s.indexOf('z'));
//        System.out.println(s.LastIndexOf('a'));

        //Compare to
        String a= "abc";
        String b = "abcasd";
        System.out.println(a.compareTo(b));
    }
}
