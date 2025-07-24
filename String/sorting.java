package String;
import java.util.Arrays;
public class sorting {
    public static void main(String[] args) {
        String s = "Ravi";
        char[] ch = s.toCharArray();

        // Print original
        for (char ele : ch) {
            System.out.print(ele);
        }
        System.out.println();

        // Sort and print
        Arrays.sort(ch);
        for (char ele : ch) {
            System.out.print(ele);
        }
        System.out.println();

        // In StringBuilder
        StringBuilder sb = new StringBuilder("Raj");
        char[] arr = sb.toString().toCharArray(); // Fixed Char to char

        Arrays.sort(arr); //  Sort the correct array

        for (char ele : arr) { // Print the correct array
            System.out.print(ele);
        }
        System.out.println();
    }
}
