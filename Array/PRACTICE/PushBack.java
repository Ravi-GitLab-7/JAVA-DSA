package Array.PRACTICE;
import java.util.ArrayList;
public class PushBack {
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>(5);
        System.out.println(arr+" "+arr.size());
        arr.add(20);
        System.out.println(arr+" "+arr.size());
        arr.add(30);
        System.out.println(arr+" "+arr.size());
        arr.add(-40);
        System.out.println(arr+" "+arr.size());
        arr.add(50);
        System.out.println(arr+" "+arr.size());
        arr.remove(2);
        System.out.println(arr+" "+arr.size());
    }
}
