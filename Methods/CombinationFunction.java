package Methods;
import java.util.Scanner;
public class CombinationFunction {

    public static int fact(int x){
        int xFact = 1;
        for (int i =1; i <=x ; i++) {
            xFact *=i;
        }
        return xFact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int ncr= fact (n) / (fact (r) * fact (n-r));
        System.out.println(ncr);
    }
}
