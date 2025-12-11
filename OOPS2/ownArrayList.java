package OOPS2;
class ArrayList{
    int []arr;
    int idx;
    int size;
    ArrayList(int capacity){
        arr = new int[capacity];
    }
    void add(int ele){
        if(idx == arr.length) { // array is full
            int [] arr2 = new int [arr.length * 2];
            for(int i = 0;i<arr.length;i++){
            }
            arr2 = arr;
        }
        arr[idx++] = ele;
        size++;
    }
    void removeFromEnd(){
        idx --;
        size --;
    }
    void remove(int index){

    }
    void insert(int index){

    }
    int capacity(){
        return arr.length;
    }
    void diaplay(){
        for(int i = 0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    int get(int index) {
        return arr[index];
    }
}
public class ownArrayList {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(8);
        System.out.println(arr.capacity());
        arr.add(10); arr.add(20);  arr.add(30);
        System.out.println(arr.size);
        arr.diaplay();
        System.out.println(arr.get(1));
        arr.add(40);
        arr.diaplay();
    }
}
