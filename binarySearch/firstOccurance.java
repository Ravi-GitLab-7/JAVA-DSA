package binarySearch;
public class firstOccurance{
    public static int occuranceFirst(int [] arr){
        int n = arr.length , target = 78;
        int lo = 0, hi = n - 1;
        int ans = -1;  // store first occurrence index

        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] == target){
                ans = mid;   // possible first occurrence
                hi = mid - 1; // move left to check earlier index
            }
            else if(arr[mid] > target){
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {10,23,45,56,78,78,89,99};
        int occurance = occuranceFirst(arr);
        System.out.println("First Occurrence is at index: " + occurance);
    }
}
