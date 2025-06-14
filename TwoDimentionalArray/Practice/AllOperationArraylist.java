package TwoDimentionalArray.Practice;
import java.util.ArrayList;
import java.util.List;
public class AllOperationArraylist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // add()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("After add(): " + list);

        // remove() - removes element at index 2
        list.remove(2); // removes 30
        System.out.println("After remove(index 2): " + list);

        // get()
        System.out.println("Element at index 1 using get(): " + list.get(1));

        // size()
        System.out.println("Size of list using size(): " + list.size());

        // contains()
        System.out.println("List contains 40? " + list.contains(40));

        // indexOf()
        System.out.println("Index of 50: " + list.indexOf(50));

        // toArray()
        Object[] arr = list.toArray();
        System.out.print("Elements using toArray(): ");
        for(Object o : arr){
            System.out.print(o + " ");
        }
        System.out.println();

        // isEmpty()
        System.out.println("Is the list empty? " + list.isEmpty());

        // clear()
        list.clear();
        System.out.println("After clear(): " + list);
        System.out.println("Is the list empty after clear()? " + list.isEmpty());
    }
}