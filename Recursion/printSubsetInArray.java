package Recursion;
import java.util.ArrayList;
public class printSubsetInArray {
    public static void printSubsets(int i, int[] arr, ArrayList<Integer> ans) {
        if (i == arr.length) {
            System.out.println(ans);
            return;
        }
        // skip current element
        printSubsets(i + 1, arr, ans);
        // take current element
        ans.add(arr[i]);
        printSubsets(i + 1, arr, ans);
        // backtrack (remove the element we added)
        ans.remove(ans.size() - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printSubsets(0, arr, new ArrayList<>());
    }
}
