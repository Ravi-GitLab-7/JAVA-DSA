package Queue;
public class arrayImplation {
    static int[] arr = new int[5]; // queue size
    static int f = -1; // front
    static int r = -1; // rear
    static int size = 0;
    // ADD (enqueue)
    static void add(int val) {
        if (r == arr.length - 1) {
            System.out.println("Queue is Full");
            return;
        }
        if (f == -1) {   // first element
            f = r = 0;
        } else {
            r++;
        }
        arr[r] = val;
        size++;
    }
    // REMOVE (dequeue)
    static int remove() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int val = arr[f];
        f++;
        size--;
        // reset if queue becomes empty
        if (size == 0) {
            f = r = -1;
        }
        return val;
    }
    // PEEK
    static int peek() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[f];
    }
    // ISEMPTY
    static boolean isEmpty() {
        return size == 0;
    }
    // DISPLAY
    static void display() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = f; i <= r; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        add(10);
        add(20);
        add(30);
        add(40);
        display();   // 10 20 30 40
        System.out.println("Removed: " + remove()); // 10
        display();   // 20 30 40
        System.out.println("Peek: " + peek()); // 20
    }
}