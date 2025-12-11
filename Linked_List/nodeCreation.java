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
//    public static void print(Node head){
//        Node temp = head;
//        while (temp != null){
//            System.out.println(temp.val);
//            temp = temp.next;
//        }
  // print recurvesely

        public static void dispalyRecusively(Node head){
            if(head == null) return;  //base case
            System.out.println(head.val);  // print value
            dispalyRecusively(head.next);  // call
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(65);
        //link each other
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        dispalyRecusively(a);

//        //now print their value
//        System.out.println(a.val);
//        System.out.println(a.next.val);
//        System.out.println(a.next.next.val);
//        System.out.println(a.next.next.next.val);
//        System.out.println(a.next.next.next.next.val);
    }
}
