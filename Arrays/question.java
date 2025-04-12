package Arrays;
import java.util.Scanner;
public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks={23,47,45,87,33,54,20};
        for (int i = 0; i < marks.length ; i++) {
            if(marks[i]<35)
                System.out.println(i+" ");

        }
    }
}
