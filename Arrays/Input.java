package Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        //input
        System.out.print("Enter the element");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        //output
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
