package PatternPrinting.Practice;

import java.util.Scanner;

public class MixedAlphabetAndNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(i%2==0){
                    System.out.print((char)(j+64)+" ");
                }
                else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
