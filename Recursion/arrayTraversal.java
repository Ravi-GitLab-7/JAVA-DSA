package Recursion;
public class arrayTraversal {
    public static void print(int i,int[] arr){
        if(i==arr.length) return;  // base case
            System.out.println(arr[i]+" ");  // work
            print(i+1,arr);
    }
    public static void main(String[] args) {
        int[]arr = {2,3,4,5,6,7};
        print(0,arr);
    }
}
