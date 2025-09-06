package binarySearch;
public class bs {
    public static void main(String[] args) {
        int [] arr={10,23,46,89,91,97,107,140,264};
        int n = arr.length;
        int target = 51;
        int low = 0;
        int high= n-1;
        boolean flag = false; // it means not present

        //binary search
      while(low<=high){
          int mid = (low+high)/2;
          if(arr[mid] < target) low = mid+1;
          else if(arr[mid] > target) high = mid-1;
          else if(arr[mid] == target){
              flag = true;
              break;
          }
      }
      if(flag==true) System.out.println("Target Present");
      else System.out.println("Target Not Present");
    }
}
