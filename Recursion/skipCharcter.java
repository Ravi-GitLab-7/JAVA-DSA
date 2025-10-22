package Recursion;
public class skipCharcter {
    public static void skp(int i,String s, String ans){
        if(i==s.length()){
            System.out.print(ans);
            return;
        }
        if(s.charAt(i)!='a') ans += s.charAt(i);
        skp(i+1,s,ans);
    }
    public static void main(String[] args) {
        String s = "Ravi Raj";
        skp(0,s,"");
    }
}
