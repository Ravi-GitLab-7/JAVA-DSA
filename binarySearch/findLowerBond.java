package binarySearch;
public class findLowerBond {
    public static void main(String[] args) {
        int [] arr = {4, 6, 10, 12, 18, 18, 20, 20, 30, 45};
        int n = arr.length;
        int lb = n;
        int lo=0,hi=n-1;
        int target = 18;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>=target){
                lb=Math.min(lb, mid);
                hi = mid - 1;
            }
            else lo= mid+1;
        }
        System.out.println(lb);
    }
}
