package Heaps;

class MaxHeap {

    int[] arr;
    int size;

    MaxHeap(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    // Add element
    public void add(int num) {

        arr[size++] = num;

        upHeapify(size - 1);
    }

    // Up Heapify
    public void upHeapify(int idx) {

        if (idx == 0) {
            return;
        }

        int parent = (idx - 1) / 2;

        // Max Heap: child should be smaller than parent
        if (arr[idx] > arr[parent]) {

            swap(idx, parent);

            upHeapify(parent);
        }
    }

    // Peek maximum element
    public int peek() throws Exception {

        if (size == 0) {
            throw new Exception("Heap is Empty!");
        }

        return arr[0];
    }

    // Remove maximum element
    public int remove() throws Exception {

        if (size == 0) {
            throw new Exception("Heap is Empty!");
        }

        int peek = arr[0];

        swap(0, size - 1);

        size--;

        downHeapify(0);

        return peek;
    }

    // Down Heapify
    public void downHeapify(int i) {

        if (i >= size) {
            return;
        }

        int lc = 2 * i + 1;
        int rc = 2 * i + 2;

        // Assume current element is maximum
        int maxIdx = i;

        // Check left child
        if (lc < size && arr[lc] > arr[maxIdx]) {
            maxIdx = lc;
        }

        // Check right child
        if (rc < size && arr[rc] > arr[maxIdx]) {
            maxIdx = rc;
        }

        // Already in correct position
        if (i == maxIdx) {
            return;
        }

        swap(i, maxIdx);

        downHeapify(maxIdx);
    }

    // Swap
    public void swap(int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Size
    public int size() {
        return size;
    }
}


public class maxHeapArrayImple {

    public static void main(String[] args) throws Exception {

        MaxHeap pq = new MaxHeap(10);

        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(2);
        pq.add(8);

        System.out.println("Maximum element: " + pq.peek());

        System.out.println("Removed: " + pq.remove());
        System.out.println("Maximum element: " + pq.peek());

        System.out.println("Removed: " + pq.remove());
        System.out.println("Maximum element: " + pq.peek());

        System.out.println("Heap size: " + pq.size());
    }
}

// samallest element coverinbg element from k lists

//import java.util.*;
//
//class Solution {
//
//    public int[] smallestRange(List<List<Integer>> nums) {
//
//        // Number of lists
//        int k = nums.size();
//
//        // bestL = left side of our best answer
//        int bestL = 0;
//
//        // bestR = right side of our best answer
//        // Initially keep it as the largest possible integer
//        int bestR = Integer.MAX_VALUE;
//
//
//        // -----------------------------------------
//        // Choose every element as the LEFT boundary
//        // -----------------------------------------
//
//        // i = which list we are currently using
//        for (int i = 0; i < k; i++) {
//
//            // j = which element of that list
//            // we are using as the left boundary
//            for (int j = 0; j < nums.get(i).size(); j++) {
//
//                // Take the current element as LEFT
//                //
//                // Example:
//                // nums = [[4,10,15], [0,9,12], [5,18,22]]
//                //
//                // left can be 4, 10, 15, 0, 9, 12, ...
//                int left = nums.get(i).get(j);
//
//
//                // We need to find the RIGHT boundary.
//                //
//                // We will find one suitable number
//                // from every list and take the maximum.
//                int right = Integer.MIN_VALUE;
//
//
//                // Assume that a valid range is possible
//                boolean possible = true;
//
//
//                // -----------------------------------------
//                // Check EVERY list
//                // -----------------------------------------
//
//                for (int x = 0; x < k; x++) {
//
//                    // We haven't found a suitable element
//                    // in this list yet
//                    boolean found = false;
//
//
//                    // Search inside the current list
//                    for (int y = 0; y < nums.get(x).size(); y++) {
//
//                        // Take the current element
//                        int value = nums.get(x).get(y);
//
//
//                        // We need an element that is
//                        // greater than or equal to LEFT
//                        //
//                        // Because the range is:
//                        //
//                        // [left ........ right]
//                        //
//                        // Therefore value must be >= left
//                        if (value >= left) {
//
//                            // This value can represent this list
//                            //
//                            // We need the largest value among
//                            // all lists because that will become RIGHT
//                            right = Math.max(right, value);
//
//
//                            // We found a suitable value
//                            found = true;
//
//
//                            // Since each list is sorted,
//                            // the first value >= left is the
//                            // smallest suitable value.
//                            //
//                            // So stop searching this list.
//                            break;
//                        }
//                    }
//
//
//                    // If we could not find any value >= left
//                    // in this list, then this LEFT cannot make
//                    // a valid range containing all lists.
//                    if (!found) {
//
//                        // Mark this range as impossible
//                        possible = false;
//
//                        // No need to check remaining lists
//                        break;
//                    }
//                }
//
//
//                // -----------------------------------------
//                // Check whether this is the BEST range
//                // -----------------------------------------
//
//                // possible == true means:
//                // Every list has at least one element
//                // inside our range.
//                //
//                // right - left = length of current range
//                //
//                // bestR - bestL = length of previous best range
//                if (possible && right - left < bestR - bestL) {
//
//                    // Current range is smaller,
//                    // so save it as our best answer.
//                    bestL = left;
//                    bestR = right;
//                }
//            }
//        }
//
//
//        // Return the smallest range
//        return new int[]{bestL, bestR};
//    }
//}