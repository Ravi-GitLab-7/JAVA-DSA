package Loops;

public class PrimeCheck {
    public static void main(String[] args) {
        int n = 29, count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (n <= 1) {
            System.out.println("Not Prime");
        } else {
            System.out.println((count == 0) ? "Prime" : "Not Prime");
        }
    }
}
