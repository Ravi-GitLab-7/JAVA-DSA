package OOPS;

public class MethodOneButDifferent{
    public void mehtodOne(String s){
        System.out.println("String version...");
    }
    public void mehtodOne(StringBuffer s){
        System.out.println("ObjectBuffer version...");
    }
    public void mehtodOne(Object o){
        System.out.println("String  o");
    }

    public static void main(String[] args) {
        MethodOne m=new MethodOne();
        m.mehtodOne(new String("Ravi"));  // String -->String
        m.mehtodOne(new StringBuffer("Ravi")); //StringBuffer
        m.mehtodOne(null);  //null -->String (reference),  StringBuffer (reference)
    }
}
