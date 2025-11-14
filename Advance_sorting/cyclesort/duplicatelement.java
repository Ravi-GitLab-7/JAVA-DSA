package Advance_sorting.cyclesort;
public class duplicatelement {
    public static void main(String[] args) {
        int [] arr = {3,3,1};
        int n = arr.length+1;
        // sum of numbers from 0 to n-1
        int totalSum = (n * (n - 1)) / 2;
        // Sum of given array
        int arrSum = 0;
        for (int x : arr) {
            arrSum  += x;
        }
        int result = arrSum - totalSum;
        System.out.println("Duplicate number is: " + result);
    }
}
