package PatternPrinting;
import java.util.Scanner;
public class StarTriangleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter N");
        int n = sc.nextInt();
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=n ; j++) {
//               if( i+j>n) System.out.print("*" +" ");
//               else System.out.print(" "+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//
        //or
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {   //spaces
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=i ; j++) {  // star
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

