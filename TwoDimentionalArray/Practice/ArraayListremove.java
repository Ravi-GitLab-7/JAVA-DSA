package TwoDimentionalArray.Practice;
import java.util.ArrayList;
import java.util.List;
public class ArraayListremove {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10);a.add(20);a.add(30);a.add(40);a.add(50);

        for(int i =0;i<a.size();i++){
            if(a.get(i)==50)
                a.remove(i);
        }
        for(Integer ele:a){
            System.out.print(ele+" ");
        }
    }
}
