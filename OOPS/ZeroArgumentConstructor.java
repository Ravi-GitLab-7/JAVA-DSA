package OOPS;

public class TestAppThree {
    // Inner class
    class Employee {
        String name;
        int age;

        // Zero-argument constructor
        Employee() {
            System.out.println("Employee constructor called");
        }

        // Instance method
        public void disp() {
            System.out.println("Name is : " + name);
            System.out.println("Age is " + age);
        }
    }

    public static void main(String[] args) {
        TestAppThree outer = new TestAppThree(); // Create an instance of the outer class
        Employee emp = outer.new Employee(); // Create an instance of the inner class
        emp.disp();
    }
}
