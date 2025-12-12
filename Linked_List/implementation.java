package Linked_List;

class SLL{
    Node head;
    Node tail;
    int size = 0;

    // insert new value
    void inserAtEnd(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;   // increase length
    }

    void display(){   // print by iteration method
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void Size(){
        System.out.println("Length of Linked list is: " + size);
    }
}
public class implementation {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.Size();        // prints 0
        list.inserAtEnd(10);
        list.inserAtEnd(20);
        list.display();
        list.inserAtEnd(30);
        list.inserAtEnd(40);
        list.Size();
        list.display();


    }
}
