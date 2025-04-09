package Methods;
import java.util.Scanner;
public class SwapsNumber {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b+"swap fun");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
//        System.out.println(a+" "+b);
//        int temp = a; //a = a+b
//        a = b;        //b = a-b
//        b = temp;     //a = a-b
//        System.out.println(a+" "+b);
        System.out.println(a+" "+b+" main fun");
         swap(a,b);
        System.out.println(a+" "+b+" main fun");
    }
}
