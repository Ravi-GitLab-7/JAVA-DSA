package Linked_List;
class SLL {
    private Node head;
    private Node tail;
    private int size = 0;

    // insert new value at end
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

    // insert at head
    void inserAtHead(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }
        else {
            temp.next = head;
            head = temp;
        }
        size++;   // increase length
    }
    void inseertElement(int idx,int val){
        if(idx == 0){
            inserAtHead(val);
            return;
        }
        if(idx == size){
            inserAtEnd(val);
            return;
        }
        if(idx > size || idx < 0){
            System.out.println("Invalid!!");
        }
        Node temp = new Node(val);
        Node x = head;
        for (int i = 0; i <idx - 1 ; i++) {
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size ++;
    }
    int get(int idx){
        if(idx == size) return tail.val;
        if(idx >= size || idx < 0){
            System.out.println("Invalid");
            return -1;
        }
        Node temp = head;
        for (int i = 0; i <idx ; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    // display linked list
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // display size of linked list
    void Size(){
        System.out.println("Length of Linked list is: " + size);
    }
}

public class implementation {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.Size();           // prints 0
        list.inserAtEnd(10);
        list.inserAtEnd(20);
        list.display();        // 10 20
        list.inserAtEnd(30);
        list.inserAtEnd(40);
        list.Size();           // prints 4
        list.display();        // 10 20 30 40
        list.inserAtHead(10);
        list.inserAtHead(20);
        list.inserAtHead(30);
        list.display();        // 30 20 10 10 20 30 40
        list.inseertElement(3,100);
        list.display();

        System.out.println(list.get(6));
    }
}
