package Linked_List;

public class shallowCopyOfNode {
    public static void main(String[] args) {
        Node a = new Node(100);
        System.out.println(a);
        Node temp = a;  // shallow copy
        System.out.println(temp);
        System.out.println(a.val);
        System.out.println(temp.val);
//      Node temp = new Node(100);  // deep copy
        temp.val = 18;
        System.out.println(a.val);
    }
}
