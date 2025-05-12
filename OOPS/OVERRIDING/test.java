package OOPS.OVERRIDING;
public class test {
    class Parent {
        public void property(){
            System.out.println("Land+Cash+Gold");
        }
        public void merry(){
            System.out.println("Relativegirl...");
        }
    }
    class Child extends Parent {
        // overriding
        public void merry() {
            // Changing the implementation
            System.out.println("Look AnotherGirl...");
        }
    }
    public static void main(String[] args) {
        // Create an instance of the outer class 'test'
        test outer = new test();

        // Parent object
        Parent p1 = outer.new Parent();
        p1.property();
        p1.merry();

        System.out.println();

        // Child object
        Child c1 = outer.new Child();
        c1.property();
        c1.merry();

        System.out.println();

        // Child object through Parent reference
        Parent p2 = outer.new Child();
        p2.property();
        p2.merry();
    }
}