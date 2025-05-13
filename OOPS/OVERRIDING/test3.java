package OOPS.OVERRIDING;

class Parent {
    public Object methodOne() {
        return null;
    }
}
class Child extends Parent {
    public Object methodOne() { // Signature matches the parent method
        System.out.println("Hello From child");
        return null; // Return a value as the return type is Object
    }
}
public class test3 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.methodOne(); // Will call the overridden method in the Child class
    }
}