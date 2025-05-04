package Methods.Pratice;

public class CircleCalculator {

    // Correctly  method with return type
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the value of Radius: ");
        double r = sc.nextDouble();

        // No need to create an object for static method
        double area = calculateArea(r);
        System.out.println("Area of circle is: " + area);
    }
}