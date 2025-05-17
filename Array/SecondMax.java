package Array;

public class SecondMax {
    public static void main(String[] args) {
        int []arr = {23, 24, 25, 26, 27};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            max = Math.max(max,arr[i]);
        }
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
