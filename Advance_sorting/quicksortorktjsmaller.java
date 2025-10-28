package Advance_sorting;
public class quicksortorktjsmaller {
    static int ans;
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
    // Partition Algorithm
    public static int partition(int[] arr, int lo, int hi){
        int pivot = arr[lo];
        int pivotIdx = lo;
        int smallerCount = 0;
        // count smaller elements
        for(int i = lo + 1; i <= hi; i++){
            if(arr[i] < pivot)
                smallerCount++;
        }
        int correctIdx = pivotIdx + smallerCount;
        swap(arr, pivotIdx, correctIdx);   // pivot at correct position
        // partition process
        int i = lo, j = hi;
        while(i < correctIdx && j > correctIdx){
            if(arr[i] < pivot) i++;
            else if(arr[j] >= pivot) j--;
            else {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return correctIdx;
    }
    // Quickselect Algorithm (similar to quicksort)
    public static void quickselect(int[] arr, int lo, int hi, int k){
        if(lo > hi) return;
        int idx = partition(arr, lo, hi);
        if(idx == k - 1){
            ans = arr[idx];
            return;
        }
        else if(k - 1 < idx) quickselect(arr, lo, idx - 1, k);
        else quickselect(arr, idx + 1, hi, k);
    }
    public static void main(String[] args) {
        int[] arr = {8,1,4,9,6,3,5,2,7,0};
        int n = arr.length;
        int k = 3;
        System.out.println("Array elements:");
        print(arr);
        quickselect(arr, 0, n - 1, k);
        System.out.println(k + "rd smallest element: " + ans);
    }
}
