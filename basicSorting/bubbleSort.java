package basicSorting;

public class bubbleSort {
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {390,1,26,5,42};
        int n = arr.length;
        print(arr);
        System.out.println();
        //bubble sort
        for(int x =0;x<n-1;x++){  //for passing
            for (int i = 0; i <n-1 ; i++) {
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        print(arr);
    }
}
