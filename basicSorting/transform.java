package basicSorting;

public class transform {
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []arr = {21,34,2,65,89,43};
        //           2  3  1  5  6  4
        int n = arr.length;
        int x = 0;
        print(arr);
        System.out.println();

        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = 0; j < n; j++) {
                if (arr[j] < min && arr[j] > 0) {
                    min = arr[j];
                    mindx = j;
                }
            }
            arr[mindx] = x;
            x--;
        }
        print(arr);
        for (int i = 0; i < n; i++) {
            arr[i] *= (-1);
        }
        print(arr);
    }
}
