package Methods;

public class PassingArgument {
    public static void greed(String name){
        System.out.println("Good morning "+name);
    }
    public static void main(String[] args) {
        greed("Ravi");
        greed("Modi");
        sum(2,8);
    }
    public static void sum(int a, int b){
        System.out.println("sum is "+(a+b));
    }
}
