package Recursion;
public class functionCalls {
    public static void mango(){
        System.out.println("Hii, i am in mango method");
    }
    public static void banana(){
        mango();
        System.out.println("Hii, i am in banana method");

    }
    public static void apple(){
        banana();
        System.out.println("Hii, i am in apple method");
        mango();
    }
    public static void main(String[] args) {
        System.out.println("Hii, i am in main method");
        apple();
    }
}
