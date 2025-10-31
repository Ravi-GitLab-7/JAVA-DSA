package Advance_sorting;
import java.util.ArrayList;
public class missingnumber {
    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static ArrayList<Integer> findmissing(int []arr){
        ArrayList<Integer> missing = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i){
                missing.add(i);
            }
        }
        return missing;
    }
    public static void missingnum(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] == i || arr[i] == n) {
                i++;
            } else {
                if (arr[i] < n) {
                    swap(i, arr[i], arr);
                } else {
                    i++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 1, 0, 7, 9, 4};
        missingnum(arr);
        // print sorted array
        System.out.print("Sorted Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        // find missing numbers
        ArrayList<Integer> missing = findmissing(arr);
        System.out.println("Missing Numbers: " + missing);
    }
}
