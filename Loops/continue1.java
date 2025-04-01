package Loops;

public class continue1 {
    public static void main(String[] args) {
//        for (int i = 1; i <=100 ; i++) {
//            if (i==14 || i==20 ) continue; // continue means the skip the value
//            if (i%2==0 || i%4==0)
//                System.out.println(i);
//        }
        for (int i = 1; i <=100 ; i++) {
//            if (i%2==0 ) continue; // continue means the skip and itteration the value
            if (i%2!=0 ) continue;
                System.out.println(i);
        }
    }
}
