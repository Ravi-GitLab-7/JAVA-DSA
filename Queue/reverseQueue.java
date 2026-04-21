package Queue;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
public class reverseQueue {
    static void reverse(Queue<Integer> que) {
        Stack<Integer> st = new Stack<>();
        while (!que.isEmpty()) {
            st.push(que.remove());
        }
        while (!st.isEmpty()) {
            que.add(st.pop());
        }
    }
    static void print(Queue<Integer> que) {
        System.out.print(que);
    }
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        reverse(que);
        print(que);
    }
}