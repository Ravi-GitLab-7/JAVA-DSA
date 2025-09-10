package binarySearch;
public class MountainValueFind {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 90, 70, 60};
        int peakIndex = peakValue(arr);
        System.out.println("Peak index: " + peakIndex);
        System.out.println("Peak value: " + arr[peakIndex]);
    }
    public static int peakValue(int[] arr) {
        int n = arr.length;
        int lo = 1, hi = n - 2; // we avoid boundaries since we check mid-1 and mid+1
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1; // if no peak is found (shouldn't happen for a valid mountain array)
    }
}
