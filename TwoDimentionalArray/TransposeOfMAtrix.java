package TwoDimentionalArray;
public class TransposeOfMAtrix {
    public static void main(String[] args) {
        int [][] arr = {{2,3,4},{3,4,5}};
        int m = arr.length ,n = arr[0].length;
        for (int j = 0; j <n ; j++) {
            for (int i = 0; i <m ; i++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
