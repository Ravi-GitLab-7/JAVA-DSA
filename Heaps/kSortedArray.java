package Heaps;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
public class kSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,1,4,2,5};
        int k = 2;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> ans = new ArrayList<>();
        for (int ele : arr){
            pq.add(ele);
            if (pq.size()>k) ans.add(pq.remove());
        }
        while(pq.size()>0){
            ans.add(pq.remove());
        }
        System.out.println(ans+" ");
    }
}
