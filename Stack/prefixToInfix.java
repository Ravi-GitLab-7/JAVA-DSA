package Stack;

import java.util.Stack;

public class prefixToInfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int Ascii = (int) ch;
            // digit
            if (Ascii >= 48 && Ascii <= 57) {
                val.push("" + ch);
            }
            else {
                String v1 = val.pop();
                String v2 = val.pop();
                String t = "("+ v1 + ch + v2 +")" ; // postfix format

                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}