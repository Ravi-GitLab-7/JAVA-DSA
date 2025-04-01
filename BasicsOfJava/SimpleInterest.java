package BasicsOfJava;

public class SimpleInterest {
    public static void main(String[] args) {
        double principle = 40000;
        double radius = 4;
        double time = 2;
        double interest = (principle * radius * time)/100;
        System.out.println("simple interest is :"+interest);
    }
}
