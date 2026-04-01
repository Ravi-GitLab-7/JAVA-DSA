package Linked_List;
// user defined data type
class dNode{
    int VAl;
    dNode next;
    dNode prev;
    dNode(int Val){
        this.VAl = Val;
    }
}
// user defined data stracture
class DLL{
    
}
public class doublyLinkedListImplementation {
    public static void print(dNode head){
        dNode temp = head;
        while(temp!=null){
            System.out.print(temp.VAl+" ");
            temp= temp.next;
        }
        System.out.println();
    }
    public static void  printReverse(dNode tail){
        dNode temp = tail;
        while(temp!=null){
            System.out.print(temp.VAl+" ");
            temp= temp.prev;
        }
        System.out.println();
    }
    public static void  display(dNode node){
        dNode temp = node;
        while(temp.prev!=null){
            temp = temp.prev;
        }
            // now it reach to head
        print(temp);
    }
    public static void main(String[] args) {
//        dNode a = new dNode(10);
//        dNode b = new dNode(20);
//        dNode c = new dNode(30);
//        dNode d = new dNode(40);
//        dNode e = new dNode(50);
//
//        a.next = b; b.prev = a;
//        b.next = c; c.prev = b;
//        c.next = d; d.prev = c;
//        d.next = e; e.prev = d;
//
//        print(a);
//        printReverse(e);
//        // now give any random dll then we print whole ll
//        display(c);
        DLL list = new DLL();
    }
}
