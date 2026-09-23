package HashMapHashSet;
import org.w3c.dom.ls.LSOutput;
import java.util.HashMap;
public class mapInfo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ravi", 21);
        map.put("Rahul", 22);
        map.put("sanni", 23);
        map.put("rana", 24);
        map.put("rohti", 25);
        System.out.print(map + " "+map.size());
        System.out.println();
        System.out.println(map.containsValue(24));
        System.out.println(map.containsValue(29));
        System.out.println(map.get("rana"));
        System.out.println(map.remove(24));
        System.out.println(map.keySet());
    }
}
