package Array;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class BasicOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10);
        arr.add(1,20);  
        arr.add(2,30);  
        arr.add(3,40);  
        arr.add(4,50);  
        arr.add(5,60);
//        for (int i = 0; i <6 ; i++) {  // arr.size()
//            System.out.print(arr.get(i)+" "); //add new element
//        }
        System.out.println(arr);
        System.out.println();
        for (int i = 0; i <6 ; i++) {
            arr.set(0,100);  //modify
//          for(int ele : arr){
//              System.out.print(ele+" ");
//          }
                    for (int j = 0; j <6 ; j++) {  //arr.size()
            System.out.print(arr.get(j)+" ");
            }
            System.out.println();
             arr.add(90);  // push back
            System.out.print(arr);
        }
    }
}
