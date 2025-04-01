package Loops;
import java.util.Scanner;
public class PimeComposite {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         boolean flag = false; //check prime
        for (int i=2;i<n;i++){
            if (n%i==0){
                flag = true; // composite number
                break;
            }
        }
        if (n==1) System.out.print("neither composite nor prime");
        else if (flag==false) System.out.println("Prime number");
        else System.out.print("composite number");
    }
}
