package String;
import java.util.Scanner;
public class isomorphicString {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s = sc.nextLine();
        System.out.print("Enter the second string: ");
        String t = sc.nextLine();

//        String s = "egg";
//        String t = "add";
        if(s.length() != t.length()) {
            System.out.println("This is not Isomorphic");
            return;
        }
        boolean isIsomorphic = true;
        char [] a = new char[128];
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int) ch;
            if(a[idx] == '\0'){
                a[idx] = dh;
                break;
            }
        }

        char [] b = new char[128];
        for (int i = 0; i <t.length() ; i++) {
            char ch = t.charAt(i);
            char dh = s.charAt(i);
            int idx = (int) ch;
            if(b[idx] == '\0'){
                b[idx] = dh;
                break;
            }
        }
        if(isIsomorphic) System.out.println(" This IS Isomorphic");
        else System.out.println("This is not Isomorphic");
    }
}
