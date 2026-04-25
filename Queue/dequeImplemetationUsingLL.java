package Queue;
public class dequeImplemetationUsingLL {
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

        static class Deque {
            Node front;
            Node rear;
            int size;

            Deque() {
                front = rear = null;
                size = 0;
            }

            boolean isEmpty() {
                return size == 0;
            }

            void inserAtFront(int data) {
                Node newNode = new Node(data);

                if (front == null) {
                    front = rear = newNode;
                } else {
                    newNode.next = front;
                    front.prev = newNode;
                    front = newNode;
                }
                size++;
            }

            void insertAtRear(int data) {
                Node newNode = new Node(data);

                if (front == null) {
                    front = rear = newNode;
                } else {
                    newNode.prev = rear;
                    rear.next = newNode;
                    rear = newNode;
                }
                size++;
            }

            void deleteAtFront() {
                if (size == 0) {
                    System.out.println("Underflow condition");
                    return;
                }

                front = front.next;

                if (front == null)
                    rear = null;
                else
                    front.prev = null;

                size--;
            }

            void deleteAtRear() {
                if (size == 0) {
                    System.out.println("Underflow condition");
                    return;
                }

                rear = rear.prev;

                if (rear == null)
                    front = null;
                else
                    rear.next = null;

                size--;
            }

            int getFront() {
                if (size == 0) {
                    System.out.println("Underflow condition");
                    return -1;
                }
                return front.data;
            }

            int getRear() {
                if (size == 0) {
                    System.out.println("Underflow condition");
                    return -1;
                }
                return rear.data;
            }
        }
    }

    public static void main(String[] args) {
        Node.Deque dq = new Node.Deque();

        System.out.println("Insert 5 at rear end");
        dq.insertAtRear(5);

        System.out.println("Front: " + dq.getFront());
        System.out.println("Rear: " + dq.getRear());
    }
}