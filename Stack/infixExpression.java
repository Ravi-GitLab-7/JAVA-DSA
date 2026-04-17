package Stack;
import java.util.Stack;
public class infixExpression {
    public static void main(String[] args) {

        Stack<Integer> val = new Stack<>(); // stack for values (operands)
        Stack<Character> op = new Stack<>(); // stack for operators

        String str = "9-(5+3)*4/6"; // input expression

        // Traverse the expression
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int ascii = (int) ch;

            // If character is a digit (0–9)
            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48); // convert char to int and push

            }
            // If operator stack is empty
            else if (op.size() == 0 || ch =='('|| op.peek()=='(') {
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek() != '('){
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
                }
                op.pop();
            }
            else {

                // Case 1: low priority operators (+ or -)
                if (ch == '+' || ch == '-') {

                    // Perform previous operation
                    int v2 = val.pop();
                    int v1 = val.pop();

                    if (op.peek() == '-') val.push(v1 - v2);
                    if (op.peek() == '+') val.push(v1 + v2);
                    if (op.peek() == '*') val.push(v1 * v2);
                    if (op.peek() == '/') val.push(v1 / v2);

                    op.pop(); // remove operator
                    op.push(ch); // push current operator
                }

                // Case 2: high priority operators (* or /)
                else if (ch == '*' || ch == '/') {

                    // If top has same priority, solve first
                    if (op.peek() == '*') {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        val.push(v1 * v2);
                        op.pop();
                    }

                    if (op.peek() == '/') {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        val.push(v1 / v2);
                        op.pop();
                    }

                    op.push(ch); // push current operator
                }

                // Default case
                else {
                    op.push(ch);
                }
            }
        }

        // Final evaluation (remaining operations)
        while (val.size() > 1) {

            int v2 = val.pop();
            int v1 = val.pop();

            if (op.peek() == '-') val.push(v1 - v2);
            if (op.peek() == '+') val.push(v1 + v2);
            if (op.peek() == '*') val.push(v1 * v2);
            if (op.peek() == '/') val.push(v1 / v2);

            op.pop();
        }

        // Final result
        System.out.println(val.peek());
    }
}