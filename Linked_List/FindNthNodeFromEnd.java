package Linked_List;
import java.util.Scanner;
//// Solution class (same efficient two-pointer logic)
//class Solution {
//    public ListNode findNthFromEnd(ListNode head, int n) {
//        if (head == null) return null;
//
//        ListNode slow = head;
//        ListNode fast = head;
//
//        // Step 1: Move fast n steps ahead
//        for (int i = 1; i <= n; i++) {
//            if (fast == null) return null;   // n is greater than length
//            fast = fast.next;
//        }
//
//        // Step 2: Move both together
//        while (fast != null) {
//            slow = slow.next;
//            fast = fast.next;
//        }
//
//        return slow;
//    }
//}
public class FindNthNodeFromEnd {
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // Create linked list: 1 → 2 → 3 → 4 → 5 → 6 → 7
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);

        System.out.print("Original List : ");
        printList(head);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter value of n (nth node from end): ");
        int n = sc.nextInt();

        Solution sol = new Solution();
        ListNode result = sol.findNthFromEnd(head, n);

        if (result == null) {
            System.out.println(" Invalid n! (n is greater than length of list)");
        } else {
            System.out.println( n + "th node from end = " + result.val);
        }
        sc.close();
    }
}
