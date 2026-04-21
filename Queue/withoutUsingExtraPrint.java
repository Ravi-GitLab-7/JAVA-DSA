package Queue;
import java.util.ArrayDeque;
import java.util.Queue;

public class withoutUsingExtraPrint {
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        Queue<Integer> helper = new ArrayDeque<>();
        while(que.size() > 0){
            System.out.println(que.peek()+" ");
            helper.add(que.remove());
        }
        while(helper.size() > 0){
            System.out.println(helper.peek()+" ");
            que.add(helper.remove());
        }
    }
}
