package OOPS2;
import com.sun.security.jgss.GSSUtil;
class Student {  // this dataa types
    String name ;
    int roln;
    double cgpa;
}
public class uerdefined {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ravi Raj";
        s1.roln = 249026;
        s1.cgpa = 8.5;

        Student s2 = new Student();
        s2.name = "Hari thapa";
        s2.roln = 249146;
        s2.cgpa = 8.9;

        Student s3 = new Student();
        s3.name = "Rahul kumar";
        s3.roln = 249027;
        s3.cgpa = 9.5;

        System.out.println(s1.name);
        System.out.println(s3.cgpa);
    }
}
