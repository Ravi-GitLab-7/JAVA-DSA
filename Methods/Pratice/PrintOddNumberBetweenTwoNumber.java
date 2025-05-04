package Methods.Pratice;

public class PrintOddNumberBetweenTwoNumber {

    // Correct method
    public static void knowOddNumber(int x, int y) {
        System.out.println("Odd numbers between " + x + " and " + y + " are:");
        for (int i = x; i <= y; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the First number:");
        int a = sc.nextInt();

        System.out.println("Enter the Second number:");
        int b = sc.nextInt();

        knowOddNumber(a, b); // Just call the static method
    }
}
