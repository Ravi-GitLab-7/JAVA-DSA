package HashMapHashSet;
import java.util.HashSet;
public class implement {
    public static void main(String[] args) {
        // insert, delete , search : TC ->o(1)
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(40);
        set.add(50);
        set.add(60);
        System.out.println(set);
        System.out.println(set.size());
        set.remove(40);
        System.out.println(set + " "+set.size());
        Object[] arr = set.toArray();
        System.out.println(set.contains(50));
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
