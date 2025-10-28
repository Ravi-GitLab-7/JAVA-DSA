package Recursion.Preactice;
import java.util.ArrayList;
import java.util.List;
public class arraangeelement {
    public static void generateformA(int []a, int[] b, int i, int j, List<Integer> ans) {
        if(i == a.length) return;
        // take from A[i]
        if(ans.isEmpty() || a[i] > ans.get(ans.size() - 1)) {
            ans.add(a[i]);
            generateformB(a, b, i + 1, j, ans);
            ans.remove(ans.size() - 1);
        }
        // Skip A[i]
        generateformA(a, b, i + 1, j, ans); //recursive call
    }
    public static void generateformB(int []a, int[] b, int i, int j, List<Integer> ans) {
        if(j == b.length) return;
        // take from B[j]
        if(b[j] > ans.get(ans.size() - 1)) {
            ans.add(b[j]);
            System.out.println(ans); // print only when last is B
            generateformA(a, b, i, j + 1, ans);
            ans.remove(ans.size() - 1);
        }
        // Skip B[j]
        generateformB(a, b, i, j + 1, ans);  //recursive call
    }
    public static void main(String[] args) {
        int[] a = {10, 15, 25};
        int[] b = {1, 5, 20, 30};

        List<Integer> ans = new ArrayList<>();
        generateformA(a, b, 0, 0, ans);
    }
}
