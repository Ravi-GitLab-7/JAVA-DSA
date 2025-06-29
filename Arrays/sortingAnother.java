package Arrays;
import java.util.Arrays;
public class sortingAnother {
    public static void main(String[] args) {
        int []arr = {0,9,1,0,0,0,2,1,1,4};
        System.out.print("original array elements:");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println("sorted array elements:");
        Arrays.sort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
