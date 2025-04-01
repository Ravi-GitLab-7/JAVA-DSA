package Loops;

public class Pridict4 {
    public static void main(String[] args) {
//        int i =10;
//        while(i==20)
//            System.out.println("Ravi");  //not given condition
        int x= 4,y=0;
        while(x<=0){
            x--;
            y++;
            if(x==y)
                continue;
            else System.out.println(x+" "+y);
        }
    }
}
