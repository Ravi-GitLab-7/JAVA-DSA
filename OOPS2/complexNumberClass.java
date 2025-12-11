package OOPS2;

class complexNumber {
    double x;
    double y;

    complexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        if (y >= 0)
            System.out.println(x + " + " + y + "i");
        else
            System.out.println(x + " - " + (-y) + "i");
    }

    // Add two complex numbers
    void add(complexNumber c) {
        this.x += c.x;
        this.y += c.y;
    }

    // Subtract two complex numbers
    void subtract(complexNumber c) {
        this.x -= c.x;
        this.y -= c.y;
    }

    // Multiply two complex numbers
    void multiply(complexNumber c) {
        double a = this.x;
        double b = this.y;
        double c1 = c.x;
        double d1 = c.y;

        this.x = a*c1 - b*d1;    // real part
        this.y = a*d1 + b*c1;    // imaginary part
    }

    // Divide this complex number by c
    public void divide(complexNumber c1) {
        double a = this.x;
        double b = this.y;
        double c = c1.x;
        double d = c1.y;

        double denominator = c*c + d*d;

        double newReal = (a*c + b*d) / denominator;
        double newImag = (b*c - a*d) / denominator;

        this.x = newReal;
        this.y = newImag;
    }
}

public class complexNumberClass {
    public static void main(String[] args) {

        complexNumber c1 = new complexNumber(2, -6);
        complexNumber c2 = new complexNumber(3, 7);

        System.out.println("C1:");
        c1.print();
        System.out.println("C2:");
        c2.print();

        // Addition
        c1.add(c2);
        System.out.println("\nAfter Addition (C1 + C2):");
        c1.print();

        // Multiplication
        c2.multiply(c1);
        System.out.println("\nAfter Multiplication (C2 * C1):");
        c2.print();

        // Division
        c2.divide(c1);
        System.out.println("\nAfter Division (C2 / C1):");
        c2.print();
    }
}
