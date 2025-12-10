package OOPS2;
import java.util.*;
//// final keyword
//class cricketer{
//    final String country = "India";
//    int run;
//    String name;
//    double avg;
//}
//public class finalAndStatic {
//    public static void main(String[] args) {
//        cricketer c1 = new cricketer();
////        c1.country = "England";  // error
//        System.out.println(c1.country);
//    }
//}


// static keyword
class cricketer{
    static String country = "Nz";
    int run;
    String name;
    double avg;
    void print(){
        System.out.println(name+" "+run+" "+avg);
    }
    static void greet(){
        System.out.println("i can beleive in only jussy bhai");
    }
}
public class finalAndStatic {
    public static void main(String[] args) {
//        cricketer.greet();
        cricketer c1 = new cricketer();
//        c1.country = "England";  // error
        cricketer c2 = new cricketer();
        c1.country = "India";
        System.out.println(c1.country);

        c2.greet();
    }
}
