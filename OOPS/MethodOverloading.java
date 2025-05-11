package OOPS;

public class MethodOverloading {
    static class Calculator{
            public void add(int a,int b){
                System.out.println("int-int argument");
            }
        public void add(float a,float b){
            System.out.println("float -float  argument");
        }
        public void add(double a,double b){
            System.out.println("double-double argument");
        }
    }
    public static void main(String[] args) {
            Calculator c= new Calculator();
            c.add(10,20); //int-int argument
            c.add(10.2f,20.4f); //float -float  argument
            c.add(10.0,20.0);  //double-double argument
        c.add('a', 10);          // 'a' (char) promoted to int, matches add(int, int)
        c.add(18L, 2.0f);

    }
}
