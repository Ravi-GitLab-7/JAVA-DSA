package Stack;
import java.util.ArrayList;
import java.util.Stack;
public class previousGreaterElement {
    public static void previousGreater(int [] arr, int n){
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0;i<n;i++){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans.add(-1);
            }else{
                ans.add(st.peek());
            }
            st.push(arr[i]);
        }
        System.out.println(ans+" ");
    }
    public static void main(String[] args) {
        int [] arr = {10,4,2,20,40,12,30};
        int n = arr.length;
        previousGreater(arr,n);
    }
}
