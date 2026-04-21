import java.util.*;
public class evenPrint {
    static Queue<Integer> removeOddIndex(Queue<Integer> q) {
        Queue<Integer> newQueue = new LinkedList<>();
        int index = 0;
        while (!q.isEmpty()) {
            int val = q.remove();
            if (index % 2 == 0) {   // keep even index
                newQueue.add(val);
            }
            index++;
        }
        return newQueue;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        Queue<Integer> result = removeOddIndex(q);
        while (!result.isEmpty()) {
            System.out.print(result.remove() + " ");
        }
    }
}