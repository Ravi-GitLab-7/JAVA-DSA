package Advance_sorting;
public class mergesortdecendingorder {
    public static void print(int[] arr) {
        for (int ele : arr) System.out.print(ele + " ");
        System.out.println();
    }
    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) c[k++] = a[i++]; // descending order condition
            else c[k++] = b[j++];
        }
        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];
    }
    public static void mergesort(int[] arr) {
        int n = arr.length;
        if (n <= 1) return;
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];
        for (int i = 0; i < n / 2; i++) a[i] = arr[i];
        for (int i = 0; i < n - n / 2; i++) b[i] = arr[i + n / 2];
        mergesort(a);
        mergesort(b);
        merge(a, b, arr);
        a = null; b = null;
    }
    public static void main(String[] args) {
        int[] arr = {10, 23, 456, 67, 32, 54};
        System.out.print("Before sorting: ");
        print(arr);
        mergesort(arr);
        System.out.print("After sorting (Descending): ");
        print(arr);
        System.out.print("After sorting (Ascending): ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
