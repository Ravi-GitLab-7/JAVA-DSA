package Queue;
import java.util.ArrayDeque;
import java.util.Queue;
public class removeEvenPlace {
    static void remove(Queue<Integer> que){
        Queue<Integer> newQue = new ArrayDeque<>();
        int index = 0;
        while(!que.isEmpty()){
            int val = que.remove();
            if(index % 2 != 0){   // keep only odd index elements
                newQue.add(val);
            }
            index++;
        }
        // copy back to original queue
        while(!newQue.isEmpty()){
            que.add(newQue.remove());
        }
    }
    static void print(Queue<Integer> que){
        System.out.println(que);
    }
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        remove(que);
        print(que);
    }
}