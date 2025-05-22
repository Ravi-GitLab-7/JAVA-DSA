package Array;

public class MergeTwoSotedArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 3, 4, 5, 6};
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        // Merging two sorted arrays
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
// laqst edges
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }

        for (int ele : c) {
            System.out.print(ele + " ");
        }
    }
}
