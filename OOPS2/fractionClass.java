package OOPS2;

class fraction{
    int num;
    int den;
    fraction(int num,int den){
        this.num=num;
        this.den=den;
        simplify();
    }
    void print(){
        System.out.println(num+"/"+den);
    }
    void add(fraction f){
        this.num = num * f.den + den * f.num;
        this.den *= f.den;
        simplify();
    }
    void multiply(fraction f){
        this.num = num * f.num ;
        this.den = den * f.den;
        simplify();
    }
    void divide(fraction f){
        this.num = num * f.num ;
        this.den = den * f.den;
        simplify();
    }
    void simplify(){
        boolean isNegative = (num * den < 0) ? true : false;
        num = Math.abs(num);
        den = Math.abs(den);
        int gcd = hcf(num,den);
        num = num/gcd;
        den = den/gcd;
    }
    int hcf(int a,int b){
        if(a==0) return b;
        return hcf( b%a,a);
    }
}
public class fractionClass {
    public static void main(String[] args) {
        fraction f1 = new fraction(7,3);
        f1.print();
        fraction f2 = new fraction(3,7);
        f1.add(f2);
        f1.print();
        f1.multiply(f2);
        f1.print();
        f1.divide(f2);
        f1.print();
          fraction f3 = new fraction(50,-100);
            f3.print();
    }
}
