package Linked_List;
//class Node {
//    int val;
//    Node next;
//
//    Node(int val) {
//        this.val = val;
//        this.next = null;
//    }
//}
class Linko_List {
    // returns LEFT middle node
    public Node returnLeftNode(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public void DisplayRecursivelly(Node head) {
        if (head == null) return;
        System.out.print(head.val + " ");
        DisplayRecursivelly(head.next);
    }
}
public class returnLeftMiddle {
    public static void main(String[] args) {
        Linko_List list = new Linko_List();
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(65);
        // link nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        list.DisplayRecursivelly(a);
        System.out.println();
        Node leftNode = list.returnLeftNode(a);
        if (leftNode != null) {
            System.out.println("Left middle node is : " + leftNode.val);
        }
    }
}
