package basicSorting;
public class decreasingOrderBubbleSort {
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, -3, 5, 78, 45, 23, 97, 12, -30};
        int n = arr.length;
        print(arr);
        System.out.println();

        for(int x =n-1;x>0;x--){  //for passing  n-1 paases
            for (int i = 0 ; i <x; i++) {
                if(arr[i]<arr[i+1]){
                    int temp = arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        print(arr);
    }
}