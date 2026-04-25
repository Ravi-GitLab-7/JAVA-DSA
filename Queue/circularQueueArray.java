package Queue;

public class circularQueueArray {
    public static class Cqu{
        int front = -1;
        int rear = -1;
        int size = 0;
        int [] arr = new int[5];

        public void displau() {
            display();
        }
        
        public void add(int val){
            if(size == arr.length){
                System.out.println("Array is Full");
                return;
            }
            else if(size == 0){
                front = rear = 0;
                arr[0] = val;
            }
            else if(rear == arr.length-1){
                rear = 0;
                arr[rear] = val;
            }
            else{
                arr[++rear] = val;
            }
            size++;
        }


        public int remove(){
            if(size == 0){
                System.out.println("Que is empty");
                return -1;
            }
            else{
                int val = arr[front];
                if(front == arr.length-1) front = 0;
                else front++;
                size--;
                return val;
            }
        }

        public int peek(){
            if(size == 0){
                System.out.println("Queue is empty"); return -1;
            }
            else return arr[front];
        }

        public void display(){
            if(size == 0){
                System.out.println("Queue is empty"); return;
            }
            else if(front <= rear){
                for (int i = front; i <= rear ; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            else if(rear < front){
                for (int i = front; i < arr.length ; i++) {
                    System.out.print(arr[i]+" ");
                }
                for (int i = 0; i <= rear ; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }

        public boolean isEmpty(){
            return size == 0;
        }
    }

    public static void main(String[] args) {
        Cqu  q = new Cqu();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println(q.remove());
        q.add(6);
        q.add(7);
        q.displau();
        System.out.println(q.isEmpty());
    }
}