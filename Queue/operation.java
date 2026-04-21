package Queue;
import java.util.ArrayDeque;
import java.util.Queue;

public class operation {
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();
        System.out.println( que.isEmpty());
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        System.out.println(que);
        System.out.println(que.size());
        que.poll();
        System.out.println(que);
        System.out.println( que.isEmpty());
    }
}
