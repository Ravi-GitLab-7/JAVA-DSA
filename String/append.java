package String;
import java.util.Scanner;
public class append {
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
//        sb.append("Riya");
        char[] ch = {'R','i','y','a'};
        sb.append(ch);
        System.out.println(sb);
        int [] arr = {1,2,3,4,5};  //doesw not work address is appended
        sb.append(arr);
        System.out.println(sb);
    }
}
