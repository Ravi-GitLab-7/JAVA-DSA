package HashMapHashSet;
import java.util.HashMap;
public class iterateMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ravi", 21);
        map.put("Rahul", 22);
        map.put("sanni", 23);
        map.put("rana", 24);
        map.put("rohti", 25);
        for(String key : map.keySet()){
            int val = map.get(key);
            System.out.println(key+" "+val);
        }
        System.out.println();
        for(int val : map.values()){
            System.out.println(val);
        }
        System.out.println();
        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }
    }
}
