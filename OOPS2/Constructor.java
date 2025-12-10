package OOPS2;

public class Constructor {
    public static class Car{
        int seat;
        String name;
        double length;
        Car(){    //default constructor

        }

        Car(int x, String s,double d){    //paramatrized constructor
            seat = x;
            name = s;
            length = d;
        }
        void print(){
            System.out.println(seat+" "+name+" "+length);
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car(5,"Thar",4.0);
        c1.print();
        Car c2 = new Car(5,"Seirra",4.0);
        c2.print();
    }
}
