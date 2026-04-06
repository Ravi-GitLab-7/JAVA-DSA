package Stack;
import java.util.Stack;
public class copyStack {
    public static void main(String[] args) {
        Stack<Integer> st_original = new Stack<>();
        st_original.push(1);
        st_original.push(2);
        st_original.push(3);
        st_original.push(4);
        System.out.println(st_original);
        Stack<Integer> st_temp = new Stack<>();
        while (! st_original.isEmpty()){
            st_temp.push(st_original.pop());
        }
        System.out.println(st_temp);
        Stack<Integer> st_final = new Stack<>();
        while(! st_temp.isEmpty()){
            st_final.push(st_temp.pop());
        }
        System.out.println(st_final);
    }
}
