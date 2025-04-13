package Arrays;
import java.util.Scanner;

public class CountGreaterNumFromGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (x < arr[i]) {
                count++; // increment count by 1, not i
            }
        }

        System.out.println("Total numbers greater than " + x + ": " + count);
    }
}
