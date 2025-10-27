package Advance_sorting;
public class merge_sort {
    public static void print(int []arr){
        for(int ele : arr) System.out.print(ele+" ");
        System.out.println();
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i < a.length) c[k++] = a[i++];
        while(j < b.length) c[k++] = b[j++];
    }
    public static void mergesort(int []arr){
        int n = arr.length;
        // base case
        if(n <= 1) return;
        // create two arrays
        int[] a = new int[n/2];
        int[] b = new int[n - n/2];
        // copy elements
        for(int i = 0; i < n/2; i++) a[i] = arr[i];
        for(int i = 0; i < n - n/2; i++) b[i] = arr[i + n/2];
        // recursive calls
        mergesort(a);
        mergesort(b);
        // final merge
        merge(a, b, arr);
    }
    public static void main(String[] args) {
        int [] arr = {10, 23, 456, 67, 32, 54};
        System.out.print("Before sorting: ");
        print(arr);
        mergesort(arr);
        System.out.print("After sorting: ");
        print(arr);
    }
}
