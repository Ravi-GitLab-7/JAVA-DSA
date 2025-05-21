package Array.PRACTICE;

public class SortingOneZeros {
    public static void main(String[] args) {
        int noOfZeros = 0;
        int [] arr = {0,1,0,0,1,1,0,0,1};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0); noOfZeros++;

        }
        for (int i = 0; i < arr.length ; i++) {
            if(i<noOfZeros) arr[i]=0;
            else arr[i] = 1;
        }
    }
}
