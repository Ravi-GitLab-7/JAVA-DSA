package Array.PRACTICE;

public class SecondLargestelement {
    public static void main(String[] args) {
        int [] arr = {10,23,45,67,78};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            max = Math.max(max,arr[i]);
        }
        int smx = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smx && arr[i]!=max){
                smx = arr[i];
            }
        }
        System.out.println(smx);
    }
}
