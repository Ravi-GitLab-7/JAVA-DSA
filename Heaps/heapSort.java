package Heaps;

public class heapSort {

    public static void heapSort(int[] arr) {

        int n = arr.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            downHeapify(arr, i, n);
        }

        // Step 2: Move maximum element to the end
        for (int i = n - 1; i > 0; i--) {

            // Swap root with last element
            swap(arr, 0, i);

            // Reduce heap size
            downHeapify(arr, 0, i);
        }
    }

    // Down Heapify
    public static void downHeapify(int[] arr, int i, int size) {

        int lc = 2 * i + 1;
        int rc = 2 * i + 2;

        int maxIdx = i;

        // Check left child
        if (lc < size && arr[lc] > arr[maxIdx]) {
            maxIdx = lc;
        }

        // Check right child
        if (rc < size && arr[rc] > arr[maxIdx]) {
            maxIdx = rc;
        }

        // Already a max heap
        if (i == maxIdx) {
            return;
        }

        // Swap with larger child
        swap(arr, i, maxIdx);

        // Continue downward
        downHeapify(arr, maxIdx, size);
    }

    // Swap
    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1, 2, 7};

        System.out.println("Before sorting:");

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        heapSort(arr);

        System.out.println("\nAfter sorting:");

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}