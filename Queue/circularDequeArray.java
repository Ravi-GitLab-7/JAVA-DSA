package Queue;
public class circularDequeArray {
    static class cDque {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];
        // Insert at rear
        public void addRear(int val) {
            if (size == arr.length) {
                System.out.println("Deque is full");
                return;
            }
            if (size == 0) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % arr.length;
            }
            arr[rear] = val;
            size++;
        }
        // Insert at front
        public void addFront(int val) {
            if (size == arr.length) {
                System.out.println("Deque is full");
                return;
            }
            if (size == 0) {
                front = rear = 0;
            } else {
                front = (front - 1 + arr.length) % arr.length;
            }
            arr[front] = val;
            size++;
        }
        // Remove from front
        public int removeFront() {
            if (size == 0) {
                System.out.println("Deque is empty");
                return -1;
            }
            int val = arr[front];
            if (size == 1) {
                front = rear = -1;
            } else {
                front = (front + 1) % arr.length;
            }
            size--;
            return val;
        }
        // Remove from rear
        public int removeRear() {
            if (size == 0) {
                System.out.println("Deque is empty");
                return -1;
            }
            int val = arr[rear];

            if (size == 1) {
                front = rear = -1;
            } else {
                rear = (rear - 1 + arr.length) % arr.length;
            }
            size--;
            return val;
        }
        // Display
        public void display() {
            if (size == 0) {
                System.out.println("Deque is empty");
                return;
            }
            int i = front;
            for (int count = 0; count < size; count++) {
                System.out.print(arr[i] + " ");
                i = (i + 1) % arr.length;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        cDque dq = new cDque();
        dq.addRear(1);
        dq.addRear(2);
        dq.addFront(0);
        dq.addRear(3);
        dq.display();   // 0 1 2 3
        dq.removeFront();
        dq.removeRear();
        dq.display();   // 1 2
    }
}