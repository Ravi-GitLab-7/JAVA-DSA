package basicSorting;

public class lowerBond {
    public static void main(String[] args) {
        int[] arr ={13,45,56,56,23,86,45,67,90};
        int n = arr.length;
        int lo = 0 , hi = n-1;
        int target = 67;
        int lb = n;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(arr[mid]>=target) {
                lb = Math.min(lb, mid); // always write mid
                hi = mid-1;
            }
            else lo= mid+1;
        }
        System.out.println(lb);
    }
}
