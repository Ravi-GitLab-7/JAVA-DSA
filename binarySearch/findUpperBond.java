package binarySearch;

public class findUpperBond {
    public static void main(String[] args) {
        int []arr = {10,20,30,30,40,50};
        int n = arr.length;
        int lo=0,hi=n-1,up=n;
        int target = 30;  // for element 30 upper bond  is 40 at index 4
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>target){
                up=Math.min(up,mid);
                hi=mid-1;
            }
            else lo = mid+1;
        }
        System.out.println(up);
    }
}
