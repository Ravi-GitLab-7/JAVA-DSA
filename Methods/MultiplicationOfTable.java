package Methods;
import java.util.Scanner;
public class MultiplicationOfTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        table(n);
    }
    public static void table(int n){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n +"*"+ i+ "="+ n*i);
        }
    }
}
