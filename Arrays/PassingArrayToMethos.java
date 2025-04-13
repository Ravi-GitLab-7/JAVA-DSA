package Arrays;

public class PassingArrayToMethos {
    public static void change(int[] ravi){
        ravi[1]=34;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9,2};
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);
    }
}
