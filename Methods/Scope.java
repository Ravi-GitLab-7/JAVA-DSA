package Methods;

public class Scope {
    static  int i;
    public static void main(String[] args) {
        i=18;
        System.out.println(i);
        int i = 29;
        System.out.println(i);
        fun();
    }
    public static void fun(){
        System.out.println(i);
        i=50;
        System.out.println(i);
    }
}
