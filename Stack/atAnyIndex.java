package Stack;
import java.util.Stack;
public class atAnyIndex {
    public static void displayRecur(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.println(top);
        displayRecur(st);
        st.push(top);
        System.out.println(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        displayRecur(st);
    }
}