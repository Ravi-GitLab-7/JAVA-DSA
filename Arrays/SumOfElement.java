package Arrays;

public class SumOfElement {
    public static void main(String[] args) {
        int[] sum = {3, 4, 5, 6, 7, 8};
        int s = 0;

        for (int i = 0; i < sum.length; i++) {
            s += sum[i];
        }

        System.out.println(s);
    }
}
