package TwoDimentionalArray;
public class WavePrint {
    public static void print (int [][] arr){
        int m = arr.length , n = arr[0].length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print(arr);
        // wave form of matrix --> rows wise (Alternate)
        int m = arr.length , n = arr[0].length;
        for (int i = 0; i <m ; i++) {  // outside rows
            if(i%2==0){   //if even number the4n print rows wise
                for (int j = 0; j <n ; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{   // if odd then print alternate of row wise
                for (int j = n-1; j >=0 ; j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
