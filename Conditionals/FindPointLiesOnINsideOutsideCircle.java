package Conditionals;
import java.util.Scanner;

public class FindPointLiesOnINsideOutsideCircle {
    public static void main(String[] args) {
        // Scanner to take input
        Scanner sc = new Scanner(System.in);

        // Circle's center (x1, y1) and radius r
        int x1 = 2, y1 = 3, r = 4;

        // Point (x, y) to check
        int x = 0, y = 0;

        // Calculate the square of the distance between the point (x, y) and the center (x1, y1)
        int distanceSquared = (x - x1) * (x - x1) + (y - y1) * (y - y1);

        // Compare the squared distance with the squared radius
        if (distanceSquared > r * r) {
            System.out.println("Point lies outside the circle");
        } else if (distanceSquared < r * r) {
            System.out.println("Point lies inside the circle");
        } else {
            System.out.println("Point lies on the circle");
        }
    }
}
