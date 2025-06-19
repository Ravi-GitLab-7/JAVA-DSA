package TwoDimentionalArray.Practice;

public class WavePrintStaretFromWavePrintStaret {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 0, 16},
        };
        int m = arr.length, n = arr[0].length;
        int [][] helper = new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                helper[i][j]= arr[i][j];
            }
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if(helper[i][j]==0){
                    //set the ith rows and jth colns 0's
                    for(int b=0;b<n;b++){
                        arr[i][b]=0;
                    }
                    for(int a=0;a<m;a++){
                        arr[a][j]=0;
                    }
                }
            }
        }
        //Print
        for (int[] row : arr){
            for(int element:row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}