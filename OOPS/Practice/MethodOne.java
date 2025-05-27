package OOPS.Practice;

public class MethodOne {
    public void mehtodOne(String s){
        System.out.println("String version...");
    }
    public void mehtodOne(Object o){
        System.out.println("Object version...");
    }

    public static void main(String[] args) {
        OOPS.MethodOne m=new OOPS.MethodOne();
        m.mehtodOne("Ravi");  // String -->String
        m.mehtodOne(new Object()); //Object -->Object
        m.mehtodOne(null);  //null -->String reference  Object reference
    }
}
