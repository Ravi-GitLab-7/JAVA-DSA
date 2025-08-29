package Array;

public class Doublet {
    public static void main(String[] args) {
        int x = 9;
        int [] arr = {2,4,5,8,9,7};
        for (int i = 0; i < arr.length ; i++) {
             for (int j = i+1; j < arr.length ; j++) {
                 if(arr[i] + arr[j] == x ){
                     System.out.println(arr[i]+" "+arr[j]);
                      break;
                 }
             }
        }
    }
}
