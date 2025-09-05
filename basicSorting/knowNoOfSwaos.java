package basicSorting;
public class knowNoOfSwaos {
    public static int swapCountWithBubbleSort(int [] arr){
        int n = arr.length;
        int swaps = 0;
        boolean swapped;

        for (int i = 0; i < n-1; i++) {
            swapped = false; // reset at start of each pass
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                    swapped = true;
                }
            }
            // if no swaps happened, array already sorted
            if (!swapped) {
                break;
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        int [] arr = {6,5,4,3,2,1};
        int noSwap = swapCountWithBubbleSort(arr);

        System.out.print("Sorted array: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println("Number of swaps in bubble sort = " + noSwap);
    }
}
