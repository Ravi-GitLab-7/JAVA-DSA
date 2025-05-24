package TwoDimentionalArray;
import java.util.Scanner;
public class BasicDeclaration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]arr = new int [2][3];
        // input of 2D array
        for (int i = 0; i <2 ; i++) {    //for rows
            for (int j = 0; j <3 ; j++) {  //for columns
              arr [i][j] = sc.nextInt();
            }
        }

        //output of two dimensional array
        for (int i = 0; i <2 ; i++) {    //for rows
            for (int j = 0; j <3 ; j++) {  //for columns
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
