package TwoDimentionalArray;
public class WithtExtraVariabletransposeMatrix {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
               int temp = arr[i][j];
               arr[i][j] = arr[j][i];
               arr[j][i] = temp;
            }
            for (int ele : arr[i]) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
