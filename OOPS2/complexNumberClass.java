package OOPS2;
class complexNumber{
    int x;
    int y;
    complexNumber(int x,int y){
        this.x = x;
        this.y = y;
    }
    void print(){
       if(y>=0) System.out.println(x+" + "+y+"i");
       else System.out.println(x+" - "+(-y)+"i");
    }

    void add(complexNumber c) {
        this.x += c.x;
        this.y += c.y;
    }
    void multiply(complexNumber c) {
        this.x *= c.x;
        this.y *= c.y;
    }
}
public class complexNumberClass {
    public static void main(String[] args) {
        complexNumber c1 = new complexNumber(2,-6);
        complexNumber c2 = new complexNumber(3,7);
        c1.print();c1.print();
        c1.add(c2);
        c2.multiply(c1);
    }
}
