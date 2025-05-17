package Array;

public class MaximumElement {
    public static void main(String[] args) {
        int []arr = {23, 24, 25, 25, 27};
//        int max = arr[0];
//        for (int i = 0; i < arr.length ; i++) {
//            if(arr[i]>max);
//            max= arr[i];
//        }
//        System.out.println(max);
        //For find maximum value of the given element

//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i <arr.length ; i++) {
////            if(arr[i]>max);
////            max= arr[i];
//            max = Math.max(max,arr[i]);
//        }
//        System.out.println(max);

        //For find minimum value of the given element
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]>max);
//            max= arr[i];
            min = Math.min(min,arr[i]);
        }
        System.out.println(min);
    }
}
