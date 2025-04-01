package Conditionals;
import java.util.Scanner;
public class FindYoungerAges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of Ram");
        int Ram = sc.nextInt();
        System.out.print("Enter the age of Shyam");
        int Shyam = sc.nextInt();
        System.out.print("Enter the age of Mohan");
        int Mohan = sc.nextInt();
        if (Ram>Shyam && Ram>Mohan){
            System.out.print("Ram is greater");
        } else if (Mohan>Ram && Mohan>Shyam) {
            System.out.print("Mohan is greater");
        }
        else {
            System.out.println("Shyam is greater");
        }
    }
}
