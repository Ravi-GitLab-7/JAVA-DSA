package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={4,5,6,7,8,9};
        int x = 9 ;
        boolean flag = false; //nhi mila
        for (int i = 0; i < arr.length ; i++) {
              if(arr[i]==x ) {
                flag = true;
                break;
            }
        }
        if(flag == false) System.out.println("nhi mila h");
        else System.out.println("Mil gya h");
    }
}
