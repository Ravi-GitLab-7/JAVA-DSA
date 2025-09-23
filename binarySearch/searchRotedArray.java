class SearchRotedArray {
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target) return mid;

            // Right half is sorted
            if (nums[mid] < nums[hi]) {   // strictly <, not <=
                if (target > nums[mid] && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
            // Left half is sorted
            else {
                if (target >= nums[lo] && target < nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchRotedArray sol = new SearchRotedArray();

        int[] nums1 = {4,5,6,7,0,1,2};
        System.out.println(sol.search(nums1, 0)); // Output: 4
        System.out.println(sol.search(nums1, 3)); // Output: -1

        int[] nums2 = {1};
        System.out.println(sol.search(nums2, 0)); // Output: -1
    }
}
