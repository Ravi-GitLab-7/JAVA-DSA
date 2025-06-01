package Conditionals;
import java.util.Scanner;

public class AuthenticationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String CORRECT_USERNAME = "admin";
        final String CORRECT_PASSWORD = "password123";

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(CORRECT_USERNAME)) { // Fixed missing closing parenthesis
            if (password.equals(CORRECT_PASSWORD)) {
                System.out.println("Authentication successful!");

                // Check account status
                System.out.print("Enter account status (active/inactive): ");
                String status = scanner.nextLine();

                if (status.equalsIgnoreCase("active")) {
                    System.out.println("Welcome to the system!");

                    // Check role
                    System.out.print("Enter your role (admin/user/guest): ");
                    String role = scanner.nextLine();

                    switch (role.toLowerCase()) {
                        case "admin":
                            System.out.println("You have full access");
                            break;
                        case "user":
                            System.out.println("You have standard access");
                            break;
                        case "guest":
                            System.out.println("You have limited access");
                            break;
                        default:
                            System.out.println("Unknown role - defaulting to guest access");
                    }
                } else {
                    System.out.println("Account is inactive. Access denied.");
                }
            } else {
                System.out.println("Incorrect password");
            }
        } else {
            System.out.println("Username not found");
        }

        scanner.close();
    }
}