package Methods;

public class TriangleType {

    // Function to check the type of triangle
    public static void checkTriangleType(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Invalid side lengths. All sides must be positive.");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Not a valid triangle. The sum of any two sides must be greater than the third.");
        } else if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }
    }

    public static void main(String[] args) {
        checkTriangleType(3, 3, 3); // Equilateral
        checkTriangleType(4, 4, 6); // Isosceles
        checkTriangleType(3, 4, 5); // Scalene
        checkTriangleType(1, 2, 3); // Not a valid triangle
    }
}

