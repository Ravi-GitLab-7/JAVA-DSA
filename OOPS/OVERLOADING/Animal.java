//package OOPS.OVERLOADING;
//
//public class Animal {
//
//    // Inner class Monkey extending Animal
//    class Monkey extends Animal {
//    }
//
//    // Inner class AnimalApp with overloaded methods
//    class AnimalApp {
//        public void m1(Monkey m) {
//            System.out.println("Monkey version..");
//        }
//
//        public void m1(Animal a) {
//            System.out.println("Animal version..");
//        }
//    }
//
//    // Static main method
//    public static void main(String[] args) {
//        Animal outer = new Animal(); // Create instance of outer class
//
//        AnimalApp a = outer.new AnimalApp(); // Create instance of inner class
//        Monkey m = outer.new Monkey();       // Create instance of inner Monkey
//
//        a.m1(m); // Output: Monkey version..
//
//        Animal animal = new Animal();
//        a.m1(animal); // Output: Animal version..
//
//        Animal an = outer.new Monkey();
//        a.m1(an); // Output: Animal version..
//    }
//}

//   Anohter Method

class Calculator{

    //Method OverLoading: Same argument type but different argument count
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public void add(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }
    public void add(int a,int b,int c,int d,int e){
        System.out.println(a+b+c+d+e);
    }
}

class advanceCalculator{
    // var--args:: 0 to n;
    public void add(int... args){
        int sum = 0;
        for(int data : args){
            sum +=data;
        }
        System.out.println(sum);
    }
}

class test{
    public static void main(String[] args){
        Calculator c =new Calculator();
        c.add(10,20);
        c.add(10,20,30);
        c.add(10,20,30,40);
        c.add(10,20,30,40,50);

        System.out.println();
         advanceCalculator ac = new advanceCalculator();
        ac.add();
        ac.add(10);
        ac.add(10,20);
        ac.add(10,20,30);
        ac.add(10,20,30,40);
        ac.add(10,20,30,40,50);
    }
}

