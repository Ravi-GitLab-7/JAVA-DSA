package Arrays;

public class SwapNumber {
    public static void swap(int[] a){
        int temp = a[0];
        a[0]=a[1];
        a[1]=temp;
    }
    public static void main(String[] args) {
        int[] a = {10,20};
        System.out.println(a[0]+" "+a[1]);
        swap(a);
        System.out.println(a[0]+" "+a[1]);
    }
}
