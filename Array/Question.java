package Array;

public class Question {
    public static void main(String[] args) {
        int []arr = {23,34,45,67,23,34};
        int n = arr.length;
        for (int i = 0; i <=n ; i++) {
            if(arr[i]<35){
                System.out.print(i+" ");
            }
        }
    }
}
