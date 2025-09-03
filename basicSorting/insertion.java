package basicSorting;
public class insertion {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {390, 1, 26, 5, 42};
        int n = arr.length;
        print(arr);
        System.out.println();

        //insertion sort ->1
//        for(int i =1;i<n;i++){  //for passing n-1 passes
//            for (int j = i; j >=1 ; j--) {
//                if(arr[j]<arr[j-1]){
//                   swap(arr,j,j-1);
//                }
//                else break;
//            }
//        }
        for (int i = 1; i <= n; i++) {  //for passing n-1 passes
            int j = i;
            while (j >= 1 && arr[j] < arr[j - 1]){
                swap(arr, j, j - 1);
                j--;
            }
        }
        print(arr);
    }
}
