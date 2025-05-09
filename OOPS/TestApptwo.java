package OOPS;

public class TestApptwo {
//    class person {  //base class
//        public String name;
//        public String address;
//        public int age;
//    }

    class student  {
        //instance variable
        public String name;
        public String address;
        public int age;
        public int marks;
        public String grade;

        //constructor
        student(String name, String address, int age, int marks, String grade) {
            System.out.println("called during Object Creation...");
            this.name = name;
            this.address = address;
            this.age = age;
            this.marks = marks;
            this.grade = grade;
        }

        //normal methods
        public void disp() {
            System.out.println("Name is : " + name);
            System.out.println("Address is : " + address);
            System.out.println("Age is : " + age);
            System.out.println("Grade is : " + grade);
        }
    }

    public static void main(String[] args) {
        TestApptwo outer = new TestApptwo(); // Required for non-static inner class
        TestApptwo.student student = outer.new student("Ravi", "Bihar", 20, 100, "A");
        student.disp();
    }
}
