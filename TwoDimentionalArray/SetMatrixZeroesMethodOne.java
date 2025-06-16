package TwoDimentionalArray;
public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 0, 16},
        };
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                for (int k = 0; k <n ; k++) {
                    if(arr[i][j]==0){
                        arr[i][k]=0;
                        arr[k][j]=0;
                    }
                }
            }
        }
    }
}
