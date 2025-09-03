package basicSorting;
public class majorityElement {
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
        int [] arr = {1,1,1,2,6,6,6,3,3,3,2,4,4,4,4,4,4,4};
        int n = arr.length;
        print(arr);
        System.out.println();

        for (int i = 1; i < n; i++) {  //for passing n-1 passes
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]){
                swap(arr, j, j - 1);
                j--;
            }
        }
        print(arr);
    }
}
