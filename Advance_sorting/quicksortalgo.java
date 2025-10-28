package Advance_sorting;
public class quicksortalgo {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int lo, int hi){
        int pivot = arr[lo], pivotidx = lo;
        int smallercount = 0;
        for(int i = lo + 1; i <= hi; i++){
            if(arr[i] < pivot) smallercount++;
        }
        int correctidx = lo + smallercount;  // should be lo + smallercount, not pivot + smallercount
        swap(arr, pivotidx, correctidx);
        // partition
        int i = lo, j = hi;
        while(i < correctidx && j > correctidx){
            if(arr[i] <= pivot) i++;
            else if(arr[j] > pivot) j--;
            else {
                swap(arr, i, j);
            }
        }
        return correctidx;
    }
    public static void quicksort(int[] arr, int lo, int hi){
        if(lo >= hi) return;  // base condition should be lo >= hi
        int idx = partition(arr, lo, hi);
        quicksort(arr, lo, idx - 1); //recursive call
        quicksort(arr, idx + 1, hi);  //recursive call
    }

    public static void main(String[] args) {
        int[] arr = {2,1,4,8,6,7,3,9};
        int n = arr.length;
        System.out.println("Before Sorting:");
        print(arr);
        quicksort(arr, 0, n - 1);
        System.out.println("After Sorting:");
        print(arr);
    }
}
