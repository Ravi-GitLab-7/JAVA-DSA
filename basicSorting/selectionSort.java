package basicSorting;
public class selectionSort {
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,-3,5,78,45,23,97,12,-30};
        int n = arr.length;
        print(arr);
        System.out.println();

        for (int i = 0; i <n-1 ; i++) {  // for passing n-1 passes
            int min = Integer.MAX_VALUE;
            int mnidx  = -1;
            for(int j =i;j<n;j++){ // bc of on the every pass take it fist i form
                if(arr[j]<min){
                    min = arr[j];
                    mnidx=j;
                }
            }
            //seapping the passes of the array with the smallest element
            int temp = arr[i];
            arr[i]= arr[mnidx];
            arr[mnidx] = temp;
        }
        print(arr);
    }
}
