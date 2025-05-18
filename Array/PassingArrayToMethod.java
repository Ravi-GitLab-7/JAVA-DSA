package Array;
import static Arrays.PassingArrayToMethos.change;
public class PassingArrayToMethod {
    //passing pass by reference
    public static void change (int [] arr){
        arr[0]=200;
    }
    public static void main(String[] args) {
        int [] arr = {10,20,30,40};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
}
