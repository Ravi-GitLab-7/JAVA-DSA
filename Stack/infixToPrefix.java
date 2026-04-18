package Stack;
import java.util.Stack;

public class infixToPrefix {
    public static void main(String[] args) {

        String str = "8-(5+3)*(4/6)";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int Ascii = (int) ch;

            // digit
            if (Ascii >= 48 && Ascii <= 57) {
                String s = "" + ch;
                val.push(s);
            }

            // push if empty or '('
            else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            }

            // closing bracket
            else if (ch == ')') {
                while (op.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                }
                op.pop(); // remove '('
            }

            else {

                // + or -
                if (ch == '+' || ch == '-') {

                    while (!op.isEmpty() && op.peek() != '(') {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        val.push(t);
                    }
                    op.push(ch);
                }

                // * or /
                else if (ch == '*' || ch == '/') {

                    while (!op.isEmpty() && (op.peek() == '*' || op.peek() == '/')) {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        val.push(t);
                    }
                    op.push(ch);
                }

                else {
                    op.push(ch);
                }
            }
        }

        // remaining operations
        while (val.size() > 1) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = o + v1 + v2;
            val.push(t);
        }

        System.out.println(val.peek());
    }
}