package Recursion;
import java.util.ArrayList;
public class increaseSequencesInString {
    public static void printSequence(int start, String s, int k, String current, ArrayList<String> result) {
        // Base case: if current sequence length is k
        if (current.length() == k) {
            result.add(current); // add the sequence
            return;
        }
        for (int i = start; i < s.length(); i++) {
            current += s.charAt(i); // take
            printSequence(i + 1, s, k, current, result); // recursive call
            current = current.substring(0, current.length() - 1); // backtrack
        }
    }
    public static void main(String[] args) {
        String s = "abcd";
        int k = 3;
        ArrayList<String> result = new ArrayList<>();
        printSequence(0, s, k, "", result);
        System.out.println(result);
    }
}
