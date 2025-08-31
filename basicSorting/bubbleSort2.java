package basicSorting;
public class bubbleSort2 {
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

        //bubble sort => 2
        for(int x =0;x<n-1;x++){  //for passing  n-1 paases
            for (int i = 0; i <n-1-x ; i++) {
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
