package Linked_List;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
//        this.next = null; // this take by default not need to instilize
    }
}
public class nodeCreation {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        //link each other
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        //now print their value
        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.next.val);
    }
}
