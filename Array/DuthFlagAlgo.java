package Array;
public class DuthFlagAlgo {
    public static void main(String[] args) {
      int [] arr= {0,0,0,1,1,0,2,2,1,2,0,1,2,0,2,1};
      int n = arr.length;
      int noOfZeros= 0,NoOfOnes=0;
      for(int i =0;i<n;i++){
          if(arr[i]==0) noOfZeros++;
          if(arr[i]==1) NoOfOnes++;
      }
      //sorting array
        for(int i =0;i<n;i++){
            if(i<noOfZeros) arr[i] = 0;
            else if(i<noOfZeros+NoOfOnes) arr[i]= 1;
            else arr[i]=2;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
