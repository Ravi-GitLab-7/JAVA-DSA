package OOPS.Abstract;

// Exposing the set of services but hiding the internal implementation
// Abstract class
abstract class Person {
    String name;
    int age;
    float height;

    // Constructor
    Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}

class Student extends Person {
    int marks;
    float avg;

    // Constructor
    Student(String name, int age, float height, int marks, float avg) {
        // To call parameterized constructor of the parent class
        super(name, age, height);
        this.marks = marks;
        this.avg = avg;
    }

    // Method to display student data
    public void display() {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Height is: " + height);
        System.out.println("Marks are: " + marks);
        System.out.println("Average is: " + avg);
    }
}

public class New1 {
    public static void main(String[] args) {
        // Create an instance of Student and call display
        Student student = new Student("Ravi", 20, 5.6f, 99, 53.5f);
        student.display();  // Invoke the display method on the instance
    }
}