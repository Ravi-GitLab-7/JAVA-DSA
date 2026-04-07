package Stack;

public class arrayImplementation {

    static class stack {
        private int[] arr = new int[5];
        private int idx = 0;

        void push(int x) {
            if (isFull()) {
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx - 1];
            idx--;
            return top;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx - 1];
        }

        void display() {
            for (int i = 0; i < idx; i++) {
                System.out.println(arr[i]);
            }
        }

        int size() {
            return idx;
        }

        boolean isEmpty() {
            return idx == 0;
        }

        boolean isFull() {
            return idx == arr.length;
        }
    }

    public static void main(String[] args) {
        stack ST = new stack();

        ST.push(10);
        ST.push(20);
        ST.push(30);

        System.out.println(ST.peek());   // 30
        System.out.println(ST.size());   // 3
        System.out.println(ST.pop());    // 30
        System.out.println(ST.size());   // 2

        ST.display();

        System.out.println(ST.isEmpty());
        System.out.println(ST.isFull());

        ST.push(60);
    }
}