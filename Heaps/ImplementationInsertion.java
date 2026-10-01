package Heaps;

class MinHeap {

    int[] arr;
    int size;

    // Constructor
    MinHeap(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    // Add element
    public void add(int num) {

        arr[size++] = num;

        // Restore Min Heap property
        upHeapify(size - 1);
    }

    // Up Heapify
    public void upHeapify(int idx) {

        // Base case
        if (idx == 0) {
            return;
        }

        int parent = (idx - 1) / 2;

        // Child is smaller than parent
        if (arr[idx] < arr[parent]) {

            swap(idx, parent);

            // Continue upward
            upHeapify(parent);
        }
    }

    // Peek minimum element
    public int peek() throws Exception {

        if (size == 0) {
            throw new Exception("Heap is Empty!");
        }

        return arr[0];
    }

    // Remove minimum element
    public int remove() throws Exception {

        if (size == 0) {
            throw new Exception("Heap is Empty!");
        }

        // Store minimum element
        int peek = arr[0];

        // Move last element to root
        swap(0, size - 1);

        // Decrease heap size
        size--;

        // Restore Min Heap property
        downHeapify(0);

        return peek;
    }

    // Down Heapify
    public void downHeapify(int i) {

        if (i >= size) {
            return;
        }

        // Left child
        int lc = 2 * i + 1;

        // Right child
        int rc = 2 * i + 2;

        // Assume current element is minimum
        int minIdx = i;

        // Check left child
        if (lc < size && arr[lc] < arr[minIdx]) {
            minIdx = lc;
        }

        // Check right child
        if (rc < size && arr[rc] < arr[minIdx]) {
            minIdx = rc;
        }

        // Already at correct position
        if (i == minIdx) {
            return;
        }

        // Swap with smaller child
        swap(i, minIdx);

        // Continue downward
        downHeapify(minIdx);
    }

    // Swap two elements
    public void swap(int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Return heap size
    public int size() {
        return size;
    }
}


// Main class
public class ImplementationInsertion {

    public static void main(String[] args) throws Exception {

        MinHeap pq = new MinHeap(10);

        // Insert elements
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(2);
        pq.add(8);

        System.out.println("Minimum element: " + pq.peek());

        System.out.println("Removed: " + pq.remove());
        System.out.println("Minimum element: " + pq.peek());

        System.out.println("Removed: " + pq.remove());
        System.out.println("Minimum element: " + pq.peek());

        System.out.println("Heap size: " + pq.size());
    }
}