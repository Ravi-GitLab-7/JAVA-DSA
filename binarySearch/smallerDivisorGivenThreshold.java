package binarySearch;
public class smallerDivisorGivenThreshold {
    public boolean isLess(int mid, int[] arr, int t) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % mid == 0)
                sum += arr[i] / mid;
            else
                sum += arr[i] / mid + 1;
        }
        return sum <= t;
    }

    public int smallestDivisor(int[] arr, int t) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        // find max element
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        int d = 1;
        int lo = 1, hi = max;

        // binary search
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isLess(mid, arr, t)) {
                d = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return d;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9};
        int target = 6;

        // create object since smallestDivisor is non-static
        smallerDivisorGivenThreshold obj = new smallerDivisorGivenThreshold();
        int result = obj.smallestDivisor(arr, target);

        System.out.println("Smallest Divisor = " + result);
    }
}
