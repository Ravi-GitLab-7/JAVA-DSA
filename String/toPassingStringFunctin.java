package String;
public class toPassingStringFunctin {
    public static void main(String[] args) {
        String s = "Ravi";
        System.out.println(s);
        change(s);
        System.out.println(s);
    }
    public static void change(String s){
        s= "Ravi";  // pass by value don't change
    }
}
