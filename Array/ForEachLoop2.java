package Array;
import java.util.Arrays;
public class ForEachLoop2 {
    public static void main(String[] args) {
        int[] arr = {23,50,90,4,105, 34, 45, 23, 34};
        // Print original array elements  by forEach loop
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        // Sort the array
        Arrays.sort(arr);
        System.out.println();
        // Print sorted array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}