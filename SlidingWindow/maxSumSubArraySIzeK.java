package SlidingWindow;
public class maxSumSubArraySIzeK {
    public static void main(String[] args) {
        int[] arr = {10, 20, 1, 3, -40, 80, 3};
        int n = arr.length;
        int k = 3;
        int maxSum = 0;
//        for (int i = 0; i < n - k + 1; i++) {
//            int sum = 0;
//            for (int j = i; j < i + k ; j++) {
//                sum += arr[j];
//            }
//            maxSum = Math.max(maxSum, sum);
//        }
//        System.out.println("Maximum Sum: " + maxSum);

        int i = 0, j = k-1,sum =0;
        for (int a = 0;a<=k-1;a++){
            sum +=  arr[a];
        }
        i++;j++;
        while(j<n){
            sum = sum - arr[i-1] + arr[j];
            maxSum = Math.max(maxSum,sum);
            i++;j++;
        }
        System.out.println(maxSum);
    }
}
