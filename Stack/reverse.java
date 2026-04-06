package Stack;
import java.util.Stack;
public class reverse {
    public static void main(String[] args) {
        Stack<Integer> st_Original = new Stack<>();
        st_Original.push(1);
        st_Original.push(2);
        st_Original.push(3);
        st_Original.push(4);
        st_Original.push(5);
        System.out.println(st_Original);
        Stack<Integer> rev_arr = new Stack<>();
        while(!st_Original.isEmpty()){
            rev_arr.push(st_Original.pop());
        }
        System.out.println(rev_arr);
    }
}
