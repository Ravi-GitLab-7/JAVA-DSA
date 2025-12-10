package OOPS2;

public class constructor2 {

    private static class pokeman {   // add static here
        String name;
        int power;

        pokeman() { }
//        int getPower{
//            return power;
//        }

        pokeman(String name, int power) {
            this.name = name;
            this.power = power;
        }

        void print() {
            System.out.println(this.name + " " + this.power);
        }
    }

    public static void main(String[] args) {

        pokeman p1 = new pokeman("Ravi", 90);  // works now
        p1.print();
    }
}
