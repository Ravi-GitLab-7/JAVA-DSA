package Methods.Pratice;

import java.util.Scanner;

public class SquareOfFirstNnumber {
    public void printSquare(int n){
        for (int i = 1; i <=n ; i++) {
            System.out.println("The square of " + i + " is: " + (i * i));
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        SquareOfFirstNnumber calc = new  SquareOfFirstNnumber(); // Use the Calculator class
        calc.printSquare(n);
    }
}
