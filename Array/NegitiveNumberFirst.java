package Array;

public class NegitiveNumberFirst {
    public static void main(String[] args) {
        int [] arr={4,3,6,8,-2,-5,-8,-9,23,435,57};
        int n = arr.length;
        int i =0;
        int j = n-1;
        while(i<j){
            if(arr[i]<0) i++;
            else if(arr[j]>=0) j--;
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele +" ");
        }
    }
}
