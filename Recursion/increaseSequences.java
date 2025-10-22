package Recursion;
import java.util.ArrayList;
public class increaseSequences {
    public static void printSequence(int start, int n, int k, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
        // Base case: if current sequence length is k
        if (current.size() == k) {
            result.add(new ArrayList<>(current)); // add a copy of current
            return;
        }
        for (int i = start; i <= n; i++) {
            current.add(i); // take
            printSequence(i + 1, n, k, current, result); // recursive call
            current.remove(current.size() - 1); // backtrack
        }
    }

    public static void main(String[] args) {
        int n = 3, k = 1;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        printSequence(1, n, k, new ArrayList<>(), result);
        System.out.println(result);
    }
}
