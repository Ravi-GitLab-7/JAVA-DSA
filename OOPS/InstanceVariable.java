package OOPS;

public class InstanceVariable {

     static class Student{
        //Instance variable
        String name;
        int age;

        //constructor
        Student(String name,int age){
            this.name=name;
            this.age=age;
        }

        //instance method
        public void disp(){
            System.out.println("Name is: "+name);
            System.out.println("Age is: "+age);
        }
    }

    public static void main(String[] args) {
        Student std1 = new Student("Ravi",20);
        std1.disp();
        Student std2 = new Student("Raj",20);
        std2.disp();
    }
}
