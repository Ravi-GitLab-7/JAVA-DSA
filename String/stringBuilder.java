package String;
public class stringBuilder {
    public static void main(String[] args) {
        String s = "Ravi";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        StringBuilder sb1 = new StringBuilder(7);
        System.out.println(sb1.capacity());
        StringBuilder sb2 = new StringBuilder();  // it take by default 16
        System.out.println(sb2.capacity());
    }
}
