package Recursion;
public class stringTraversal {
    public static void print(int i,String s){
        if(i==s.length()) return;  // base case
        System.out.print(s.charAt(i));  // work
        print(i+1,s);
    }
    public static void main(String[] args) {
        String s = "Ravi Raj";
        print(0,s);
    }
}
