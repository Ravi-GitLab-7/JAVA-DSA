package Arrays;

public class SecondLargestNum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4,7,9, 5, 6, 7, 8};
        int max = Integer.MIN_VALUE;  //if take -1 then ot not run proper

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
