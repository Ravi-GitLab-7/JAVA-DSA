package Array;

public class CopyArray {
    public static void main(String[] args) {
        int []arr = {23,34,45,67,23,34};
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println(90);
        int [] nums = arr;
        nums[0]=100;
        System.out.println(nums[0]);
    }
}
