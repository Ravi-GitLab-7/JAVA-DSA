package Project;

public class StudentApp {

    // Making Student a static nested class so it can be accessed from main()
    static class Student {
        // Data members
        private int rollNo;
        private String name;
        private String address;

        // Setter methods
        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        // Getter methods
        public int getRollNo() {
            return rollNo;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {  // corrected method name
            return address;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        // Calling setter methods
        s1.setRollNo(10);
        s1.setName("Ravi");
        s1.setAddress("Bihar");

        // Calling getter methods
        System.out.println("Roll No is: " + s1.getRollNo());
        System.out.println("Name is: " + s1.getName());
        System.out.println("Address is: " + s1.getAddress());
    }
}
