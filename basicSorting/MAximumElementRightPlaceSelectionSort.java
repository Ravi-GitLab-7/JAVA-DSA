package basicSorting;
public class MAximumElementRightPlaceSelectionSort {
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,34,65,7,98,-456,23,5,76};
        int n = arr.length;
        print(arr);
        System.out.println();

            // in each pass kth term pass in right places
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = 0;
            for (int j = 1; j < n - i; j++) {
                if (arr[j] > arr[maxIdx]) maxIdx = j;
            }

            // swapping
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        print(arr); // print after sorting
    }
}
