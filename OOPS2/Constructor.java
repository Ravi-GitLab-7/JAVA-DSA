package OOPS2;

public class Constructor {
    public static class Car{
        int price;
        String name;
        double length;
        Car(){    //default constructor

        }

        Car(int price, String name,double length){    //paramatrized constructor
            this.price = price; //this keyword print actual values given in this  code
            this.name = name;
            this.length = length;
        }
        void print(){
//            int price = 19;
            System.out.println(price+" "+name+" "+length);
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car(5,"Thar",4.0);
        c1.print();
        Car c2 = new Car(5,"Seirra",4.0);
        c2.print();
    }
}
