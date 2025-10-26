package Recursion;
import java.util.Scanner;
public class TowerOfHanoi {
    // Recursive function to move disks
    public static void towerOfHanoi(int n, char source, char helper, char destination) {
        // Base case: only 1 disk
        if (n == 1) {
            System.out.println("Disk 1 moved from " + source + " to " + destination);
            return;
        }

        // Step 1: move (n-1) disks from source → helper using destination
        towerOfHanoi(n - 1, source, destination, helper);

        // Step 2: move the nth (largest) disk from source → destination
        System.out.println("Disk " + n + " moved from " + source + " to " + destination);

        // Step 3: move (n-1) disks from helper → destination using source
        towerOfHanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N: ");
        int n = sc.nextInt();
        towerOfHanoi(n, 'A', 'B', 'C'); // A=source, B=helper, C=destination

        int totalMoves = (int) (Math.pow(2, n) - 1);
        System.out.println("Total moves: " + totalMoves);
    }
}
