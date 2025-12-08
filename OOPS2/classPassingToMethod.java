package OOPS2;
public class classPassingToMethod {
    public static class car{
        String name;
        int seats;
        int torque;
        String type;
        double length;
    }
    public static void main(String[] args) {
        car c = new car();
        c.name = "Range Rower";
        c.torque = 178;
        c.seats = 5;
        c.type= "suv";

        change(c);
        System.out.println(c.seats);  //print 4 b/c pass by reference
    }

    private static void change(car c) {
        c.seats= 4;
    }
}