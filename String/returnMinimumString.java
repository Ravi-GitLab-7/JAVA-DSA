package String;
public class returnMinimumString {
    public static void main(String[] args) {
        String[] arr = {"999999999", "998", "997", "-996", "995", "994", "993", "992","991", "990"};  // string array
        String maxS = arr[0];  // leading zero
        for (int i = 0; i <arr.length ; i++) {
            maxS = max(maxS,arr[i]);
        }
        System.out.println(maxS);
    }
    public static String max(String a,String b){
        String s = purify(a),t = purify(b);
        if(s.length()<t.length()) return b;
        if(s.length()>t.length()) return a;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)>t.charAt(i)) return a;
            if (s.charAt(i)<t.charAt(i)) return b;
            else return b;
        }
        if(a.length()>=b.length()) return a;
        else return b;
    }

    public static String purify(String s){
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)!='0') return s.substring(i);
        }
        return s;
    }
}
