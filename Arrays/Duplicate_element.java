package Arrays;

public class Duplicate_element {
    public static void main(String[] args) {
    int[] arr= {1,2,3,4,1,6,7,5,3,2,7};
        System.out.println("Duplicate elements are: ");
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
    }
}
