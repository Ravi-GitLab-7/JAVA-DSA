package Stack;
public class llImplementation {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
    public static class node {
        Node head = null;
        int size = 0;
        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int size() {
            return size;
        }
        int pop() {
            if (head == null) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }
        int peek() {
            if (head == null) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;
        }
        void display() {
            displayRec(head);
            System.out.println();
        }
        void displayRec(Node head) {
            if (head == null) {
                return;
            }
            displayRec(head.next);
            System.out.print(head.val + " ");
        }
    }
    public static void main(String[] args) {
        node st = new node();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.size());
        st.display();
        st.push(40);
        System.out.println(st.size());
        st.display();
    }
}