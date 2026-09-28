package Heaps;
import java.util.PriorityQueue;
import java.util.Collections;
public class basicHeaps {
    public static void main(String[] args) {
        // formin heap
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.add(1);
//        System.out.println(pq+" "+pq.peek());
//        pq.add(10);
//        System.out.println(pq+" "+pq.peek());
//        pq.remove();
//        System.out.println(pq+" "+pq.peek());
//        pq.add(2);
//        System.out.println(pq+" "+pq.peek());
//        pq.add(5);
//        System.out.println(pq+" "+pq.peek());
//        pq.add(4);
//        System.out.println(pq);
        //for maxHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(1);
        System.out.println(pq+" "+pq.peek());
        pq.add(10);
        System.out.println(pq+" "+pq.peek());
        pq.remove();
        System.out.println(pq+" "+pq.peek());
        pq.add(2);
        System.out.println(pq+" "+pq.peek());
        pq.add(5);
        System.out.println(pq+" "+pq.peek());
        pq.add(4);
        System.out.println(pq);
    }
}
