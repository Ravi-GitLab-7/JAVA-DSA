package Stack;
import java.util.Stack;
public class isertAtIndex {
    public static void main(String[] args) {
        // create new stack
        Stack<Integer> st_original = new Stack<>();
        st_original.push(10);
        st_original.push(20);
        st_original.push(30);
        st_original.push(40);

        Stack<Integer> st_temp = new Stack<>();
        // added element
        int new_element = 50;
        //push new element after pop original element
        while(st_original.size() > 0){
            st_temp.push(st_original.pop());
        }
        // now again push all of original element
        st_original.push(new_element);
        while(st_temp.size() > 0){
            st_original.push(st_temp.pop());
        }
        System.out.println(st_original);
    }
}
