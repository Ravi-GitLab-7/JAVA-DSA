package TwoDimentionalArray;
import java.util.ArrayList;
import java.util.List;
public class ArrayList2D {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20);
        List<Integer> b = new ArrayList<>();
        b.add(30); b.add(40); b.add(50);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(50); d.add(60); d.add(70); d.add(80);
        List<List<Integer>> x = new ArrayList<>();
        x.add(a); x.add(b);x.add(c);x.add(d);

        for (int i = 0; i < x.size(); i++) {
            List<Integer> l = x.get(i);
            for(int j = 0;j<l.size();j++){
                System.out.print(l.get(j)+" ");
            }
            System.out.println();
        }
    }
}
