package TwoDimentionalArray;
import java.util.Scanner;
public class BasicDeclaration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]arr = new int [2][3];
        int m = arr.length;
        int n = arr[0].length;
//        System.out.println(m+" ");  //find numbers of rows
//        System.out.println(n+" ");  //find numbers of columns
        // input of 2D array
        for (int i = 0; i <m ; i++) {    //for rows
            for (int j = 0; j <n ; j++) {  //for columns
              arr [i][j] = sc.nextInt();
            }
        }

       // output of two dimensional array
        for (int i = 0; i <m ; i++) {    //for rows
            for (int j = 0; j <n ; j++) {  //for columns
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
