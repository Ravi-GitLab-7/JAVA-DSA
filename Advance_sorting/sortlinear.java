package Advance_sorting;
public class sortlinear {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    // Swap function
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // Partition function
    public static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[lo];
        int i = lo, j = hi;
        while (i < j) {
            while (i <= hi && arr[i] <= pivot) i++;
            while (j >= lo && arr[j] > pivot) j--;
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, lo, j);  // put pivot in correct position
        return j;          // return pivot index
    }
    // QuickSort recursive function
    public static void quicksort(int[] arr, int lo, int hi) {
        if (lo < hi) {
            int pivotidx = partition(arr, lo, hi);
            quicksort(arr, lo, pivotidx - 1);
            quicksort(arr, pivotidx + 1, hi);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 6, 7, 2, 5, 8, 4, 9};
        System.out.print("Before sorting: ");
        print(arr);
        quicksort(arr, 0, arr.length - 1);
        System.out.print("After sorting: ");
        print(arr);
    }
}
