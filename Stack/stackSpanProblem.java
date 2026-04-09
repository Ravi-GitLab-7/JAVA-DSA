package Stack;
import java.util.Arrays;
public class stackSpanProblem {
    static void printArray(int []arr){
        System.out.println(Arrays.toString(arr));
    }
     static void calculateSpan(int[]price,int n , int[] ans){
         ans[0] = 1;
         for(int i =1;i<n;i++){
             ans[i] = 1;
             for (int j = i-1; j >=0 && price[i]>=price[j] ; j--) {
                ans[i]++;
             }
         }
     }
    public static void main(String[] args) {
        int [] price = {10,3,5,6,7,34,6};
        int n = price.length;
        int[] ans = new int[n];
        calculateSpan(price,n,ans);
        printArray(ans);
    }
}
