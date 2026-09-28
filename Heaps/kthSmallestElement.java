package Heaps;
import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallestElement {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] arr = {10,3,6,9,-4,9,30};
        int k = 4;
        for (int ele : arr){
            pq.add(ele);
            if(pq.size()>k) pq.remove();
        }
        System.out.println(pq.peek());
    }
}
