//package OOPS.OVERRIDING;
//
//class Parent {
//    public  abstract void methodOne() ; // Changed to protected to allow overriding
//}
//overriding
//class Child extends Parent {
//    @Override
//    public void methodOne() { // Now correctly overrides the Parent's method
//        System.out.println("Hi Ravi");
//    }
//}
//
//public class TestFour {
//    public static void main(String[] args) {
//        Parent p = new Child(); // Polymorphism
//        p.methodOne(); // Calls Child's version due to dynamic method dispatch
//    }
//}