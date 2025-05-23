package Array;

public class NextGreaterElement {
    public static void main(String[] args) {
        int [] arr ={10,20,34,56,23,6,67,23,78,34};
        int n = arr.length;
        int [] ans = new int [n];
        ans[n-1] = -1;
        for(int i=0;i<n;i++){
            int max = Integer.MIN_VALUE;
            for(int j= i+1;j<n;j++){
                max = Math.max(max,arr[j]);
            }
            ans[i] = max;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
