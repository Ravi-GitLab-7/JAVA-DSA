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