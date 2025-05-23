package Array;

public class NextGreaterElement {
    public static void main(String[] args) {
        int [] arr = {10, 20, 34, 56, 23, 6, 67, 23, 78, 34};
        int n = arr.length;
        int [] ans = new int[n];
        
        // Explicitly set the last element of ans
        ans[n-1] = -1; // Or any default value you want
        
        // Optimized Next Greater Element logic
        int nge = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);
        }

        // Printing the array content
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}