package basicSorting;
public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {390, 1, 26, 5, 42};
        int n = arr.length;

        boolean flag = true; // assume sorted

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                flag = false; // found unsorted pair
                break;
            }
        }

        if (flag==true)
            System.out.println("Sorted array");
        else
            System.out.println("Not sorted");
    }
}
