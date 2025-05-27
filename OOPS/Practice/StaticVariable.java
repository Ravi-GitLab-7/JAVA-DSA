package OOPS.Practice;

public class StaticVariable {
    // static variable
    static float rateofInterest = 6.9F;

    public static void main(String[] args) {
        // Accessing the static variable correctly using the class name
        System.out.println(OOPS.Practice.StaticVariable.rateofInterest);  // by className
        // Accessing the static variable using an object reference (less preferred)
        System.out.println(new StaticVariable().rateofInterest);
    }
}