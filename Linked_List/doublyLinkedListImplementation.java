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
    dNode head;
    dNode tail;
    int size;
    void display(){
        dNode temp = head;
        while(temp != null){
            System.out.print(temp.VAl+" ");
            temp= temp.next;
        }
        System.out.println();
    }
    void insrtAtEnd(int Val){
        dNode temp = new dNode(Val);
        if(size == 0) head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void inserAtHead(int Val){
        dNode temp = new dNode(Val);
        if(size == 0) head = tail = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
}

public class doublyLinkedListImplementation {
//    public static void print(dNode head){
//        dNode temp = head;
//        while(temp!=null){
//            System.out.print(temp.VAl+" ");
//            temp= temp.next;
//        }
//        System.out.println();
//    }
//    public static void  printReverse(dNode tail){
//        dNode temp = tail;
//        while(temp!=null){
//            System.out.print(temp.VAl+" ");
//            temp= temp.prev;
//        }
//        System.out.println();
//    }
//    public static void  display(dNode node){
//        dNode temp = node;
//        while(temp.prev!=null){
//            temp = temp.prev;
//        }
//            // now it reach to head
//        print(temp);
//    }
//    public boolean isPallindrome(dNode head){
//            if(head == null && head.next == null){
//                return true;
//            }
//            // find tail
//        dNode tail = head;
//            while (tail.next!= null){
//                tail = tail.next;
//            }
//            // compare both
//        while(head!= tail && head.prev != tail){
//            if(head.VAl != tail.VAl){
//                return false;
//            }
//            head = head.next;
//            tail = tail.prev;
//        }
//        return  true;
//    }
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

//        print(a);
//        printReverse(e);
//        // now give any random dll then we print whole ll
//        display(c);
//        doublyLinkedListImplementation obj = new doublyLinkedListImplementation();
//        System.out.println(obj.isPallindrome(a));
        DLL list = new DLL();
        list.display();
        list.insrtAtEnd(10);
        list.insrtAtEnd(20);
        list.insrtAtEnd(30);
        list.display();
        list.insrtAtEnd(40);
        list.display();
        System.out.println(list.size);
        list.inserAtHead(60);
        list.display();
    }
}
