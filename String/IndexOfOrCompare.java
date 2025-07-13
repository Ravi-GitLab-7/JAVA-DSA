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
        //contains
        String c = "Hello Riya";
        System.out.println(c.contains("iya"));  //countinous parts of string
        System.out.println(c.contains("ayi"));


        //StartWith
        System.out.println(c.startsWith("H"));

        //Endwith()
        System.out.println(c.endsWith("ya"));

        String d = "Hello Ravi raj";
        System.out.println(d.toLowerCase());
        System.out.println(d.toUpperCase());

        String k = "abc";
        String l = "xyz";
        System.out.println(k.concat(l));

        String m = "";
        System.out.println(m.length());  //Empty String
    }
}

