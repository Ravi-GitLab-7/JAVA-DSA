package TwoDimentionalArray;
public class searchMatrix {
    public static void main(String[] args) {
        int [][]arr = {{1,4,7,11},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,13,26,30}};
        int m = arr.length,n= arr[0].length;
        int target = 13;
        int i = 0,j=n-1;
        while(i<m && j>=0){
            if(arr[i][j]==target) {
                System.out.println("Found at "+i+" "+j);
                break;
            }
            else if (arr[i][j]>target) {  // go left
                j--;
            }
            else{
                i++;  // go down
            }
        }
    }
}
