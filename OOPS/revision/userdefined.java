package OOPS.revision;
import java.util.Scanner;
public class userdefined {
    public static class Student{  //user defined data type
        String name;
        int rln;
        double gpa;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();  // object
        s1.name = "Ravi";
        s1.rln = 235465;
        s1.gpa = 8;

        Student s2 = new Student();  // object
        s2.name = "Raj";
        s2.rln = 235464;
        s2.gpa = 8.5;

        System.out.println(s1.name);
    }
}
