package BasicsOfJava.Practice;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println((int)ch);
    }
}
