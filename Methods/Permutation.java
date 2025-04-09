package Methods;
import java.util.Scanner;
public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nFact = 1;
        for (int i = 1; i <=n ; i++) {
            nFact *=i;
        }

        int rFact = 1;
        for (int i = 1; i <=r ; i++) {
            rFact *=i;
        }

        int n_rFact = 1;
        for (int i = 1; i <=n-r ; i++) {
            n_rFact *=i;
        }

        int nPr = nFact/n_rFact;
        System.out.println(nPr);
    }
}
