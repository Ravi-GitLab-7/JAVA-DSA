package Recursion;
public class howManyVowelsInString {
    static int count = 0;
    public static void ContainVowels(String s, int i) {
        if (i == s.length()) {
            return;
        }
        if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||
                s.charAt(i) == 'o' || s.charAt(i) == 'u') {
            count++;
        }
        ContainVowels(s, i + 1);
    }
    public static void main(String[] args) {
        ContainVowels("Ravi Raj", 0);
        System.out.printf("%d", count);
    }
}
