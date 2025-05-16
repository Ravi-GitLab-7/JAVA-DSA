package Array; // Make sure the folder name is 'Array' and file is inside it
import java.util.Scanner;
public class InputUSerjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sizeof the array: ");
        int n =  sc.nextInt();
        int [] arr = new int [n];
        // Input elements
        for (int i = 0; i <= n-1; i++) {
            arr[i] = sc.nextInt();
        }

        // Output elements
        System.out.println("Array are :");
        for (int i = 0; i <=n-1; i++) {
            System.out.print(arr[i]);
        }
    }
}
