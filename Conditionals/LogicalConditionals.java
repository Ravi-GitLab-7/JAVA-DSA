package Conditionals;
import java.util.Scanner;
public class LogicalConditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nested if with logical AND (&&)
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Do you have ID? (true/false): ");
        boolean hasID = scanner.nextBoolean();

        if (age >= 18 && hasID) {
            System.out.println("You can enter the club");
        } else {
            System.out.println("Entry denied");
        }

        // Logical OR (||) example
        System.out.print("Enter day of week (1-7): ");
        int day = scanner.nextInt();
        if (day == 6 || day == 7) {
            System.out.println("It's the weekend!");
        } else {
            System.out.println("Weekday");
        }

        // Complex logical conditions
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();
        System.out.print("Is it sunny? (true/false): ");
        boolean isSunny = scanner.nextBoolean();

        if ((temp > 25 && isSunny) || (temp > 30 && !isSunny)) {
            System.out.println("Wear sunscreen!");
        }

        scanner.close();
    }
}