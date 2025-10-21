package Recursion;
public class preInPost {
    public static void pip(int n){
        if(n==0) return;
        System.out.println("Pre"+n); //pre
        pip(n-1);
        System.out.println("In"+n); //in
        pip(n-1);
        System.out.println("Post"+n); //post
    }
    public static void main(String[] args) {
        pip(3);
    }
}
