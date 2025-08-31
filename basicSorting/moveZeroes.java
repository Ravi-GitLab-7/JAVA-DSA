package basicSorting;
public class moveZeroes {
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,0,0,4,3,6,0,8};
        int n = arr.length;
        int noz = 0;
        print(arr);
        System.out.println();
        for(int ele: arr){
            if(ele==0) noz++;
        }
        for (int x = 0; x <noz ; x++) {
            for (int i = 0; i <n-1 ; i++) {
                if(arr[i]==0){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        print(arr);
    }
}

