package OOPS;

public class StaticVariable {
    //static variable
    static float rateofInterest = 6.9F;
    public static void main(String[] args) {
       System.out.println(StaticVariable.rateofInterest);  //by className
//        System.out.println(new StaticVariable().rateofInterest);  //by reference of the object
    }
}
