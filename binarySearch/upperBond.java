package basicSorting;
import java.util.Arrays;

public class upperBond {
    public static void main(String[] args) {
        int[] arr ={13,45,56,56,23,86,45,67,90};
        int n = arr.length;

        Arrays.sort(arr);   //  sort the array first

        int lo = 0 , hi = n-1;
        int target = 56;
        int ub = n;

        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(arr[mid]>target) {
                ub = Math.min(ub, mid); // always write mid
                hi = mid-1;
            }
            else lo= mid+1;
        }
        System.out.println(ub);
    }
}
