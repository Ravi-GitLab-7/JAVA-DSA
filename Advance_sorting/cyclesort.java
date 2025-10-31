package Advance_sorting;
public class cyclesort {
    public static void print(int []arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
    public static void swap(int i,int j,int[]arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 2️⃣ missingnum function corrected minimal changes
    public static void missingnum(int[]arr){
        int n = arr.length;
        int i = 0;
        while(i < n){
            if(arr[i] == i || arr[i] == n){
                i++;
            } else {
                swap(i, arr[i], arr);
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,5,3,1,0,7,9,4};
        missingnum(arr);
        // Just to show final array
        print(arr);
    }
}
