package Linked_List;

class dNode {
    int val;
    dNode next;
    dNode prev;

    dNode(int val) {
        this.val = val;
    }
}

class DLL {
    dNode head;
    dNode tail;
    int size = 0;

    //  Display Forward (Circular)
    void displayForward() {
        if (head == null) return;

        dNode temp = head;
        do {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(head)");
    }

    //  Display Backward (Circular)
    void displayBackward() {
        if (tail == null) return;

        dNode temp = tail;
        do {
            System.out.print(temp.val + " <-> ");
            temp = temp.prev;
        } while (temp != tail);

        System.out.println("(tail)");
    }

    //  Insert at Index
    void insert(int idx, int val) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid Index");
            return;
        }

        dNode newNode = new dNode(val);

        // First node
        if (size == 0) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
        }
        // Insert at beginning
        else if (idx == 0) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
        // Insert at end
        else if (idx == size) {
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
        // Insert in middle
        else {
            dNode temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }

        size++;
    }

    //  Delete at Index
    void delete(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid Index");
            return;
        }

        // Only one node
        if (size == 1) {
            head = tail = null;
        }
        // Delete head
        else if (idx == 0) {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
        // Delete tail
        else if (idx == size - 1) {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
        // Delete middle
        else {
            dNode temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }

            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        size--;
    }

    //  Get value at Index
    int get(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid Index");
            return -1;
        }

        dNode temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    //  Set value at Index
    void set(int idx, int val) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid Index");
            return;
        }

        dNode temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }

        temp.val = val;
    }
}

public class doublyCircularLL {
    public static void main(String[] args) {
        DLL list = new DLL();

        list.insert(0, 10);
        list.insert(1, 20);
        list.insert(2, 30);
        list.insert(1, 15);

        list.displayForward();   // 10 <-> 15 <-> 20 <-> 30

        list.delete(2);
        list.displayForward();   // 10 <-> 15 <-> 30

        System.out.println(list.get(1)); // 15

        list.set(1, 99);
        list.displayForward();   // 10 <-> 99 <-> 30

        list.displayBackward();  // 30 <-> 99 <-> 10
    }
}