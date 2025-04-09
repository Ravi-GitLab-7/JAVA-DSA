package Methods;

public class ReturnKeyword {
    public static void greet(int time) {
        if(time<0)  return;
            System.out.println("Good Morning");
//        else System.out.println("Good After-Noon");
    }
    public static void main(String[] args) {
        greet(-6);
    }
}
