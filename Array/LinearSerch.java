package Array;

import java.util.Scanner;

public class LinearSerch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target Element ");
        int x = sc.nextInt();
        System.out.print("Enter the size of the array ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the element of the array");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
            //solution
////            for (int i = 0; i <n ; i++) {
////                if(arr[i]==x)
////                System.out.println("element found at INdex "+i);
//
//        }
        boolean flag = false;
        for (int i = 0; i <n ; i++) {
            if(arr[i]==x);
            flag = true;
            break;
        }
        if(flag==true) System.out.println("Element found");
        else System.out.println("Element not found");
    }
}
