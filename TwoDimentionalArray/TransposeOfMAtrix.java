package TwoDimentionalArray;
public class TransposeOfMAtrix {
    public static void main(String[] args) {
        int [][] arr = {{2,3,4},{3,4,5}};
        int m = arr.length ,n = arr[0].length;
        // coln wise print
//        for (int j = 0; j <n ; j++) {  // colns
//            for (int i = 0; i <m ; i++) {  // rows
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

        // storing with the help of new transpose array
        int [][]transpose = new int [n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                transpose[j][i] = arr[i][j];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
