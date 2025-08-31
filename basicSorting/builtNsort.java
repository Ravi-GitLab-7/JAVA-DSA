package basicSorting;
import java.util.Arrays;
public class builtNsort {
    public static void main(String[] args) {
        int [] arr = {1,3,98,3,2,7};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
