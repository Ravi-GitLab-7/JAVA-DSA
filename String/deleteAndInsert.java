package String;
public class deleteAndInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcde");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        System.out.println(sb.deleteCharAt(3));
        sb.append("xyz");
        System.out.println(sb);
        sb.delete(2,4); // delete from 2 to 3
        System.out.println(sb);
        sb.setCharAt(2,'g'); // replace 2nd place of g
        System.out.println(sb);
        System.out.println(sb.insert(2,'r'));
        System.out.println(sb.insert(2,9));
        System.out.println(sb.insert(2,"ravi"));
    }
}
