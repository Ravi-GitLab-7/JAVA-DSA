package Conditionals;

public class VowelConsonant {
    public static void main(String[] args) {
        char ch = 'e';

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
    }
}
