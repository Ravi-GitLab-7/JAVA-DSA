package Linked_List;
import java.util.Scanner;
// ListNode class
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
// Solution class (same efficient two-pointer logic)
class Solution {
    public ListNode findNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        // Step 1: Move fast n steps ahead
        for (int i = 1; i <= n; i++) {
            if (fast == null) return null;   // n is greater than length
            fast = fast.next;
        }
        // Step 2: Move both together
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
