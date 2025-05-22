package Array;

public class DutchFlagSortOnesTwoZeros {
    public static void main(String[] args) {
        int [] arr = {0,1,0,2,1,1,1,2,2,2,2,1,1,1,0,0,0,0,1};
        int n = arr.length;
        int mid = 0, low = 0, high = n - 1;

        while(mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1) {
                mid++;
            }
            else {  // arr[mid] == 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
