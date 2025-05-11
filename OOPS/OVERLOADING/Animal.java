package OOPS.OVERLOADING;

public class Animal {

    // Inner class Monkey extending Animal
    class Monkey extends Animal {
    }

    // Inner class AnimalApp with overloaded methods
    class AnimalApp {
        public void m1(Monkey m) {
            System.out.println("Monkey version..");
        }

        public void m1(Animal a) {
            System.out.println("Animal version..");
        }
    }

    // Static main method
    public static void main(String[] args) {
        Animal outer = new Animal(); // Create instance of outer class

        AnimalApp a = outer.new AnimalApp(); // Create instance of inner class
        Monkey m = outer.new Monkey();       // Create instance of inner Monkey

        a.m1(m); // Output: Monkey version..

        Animal animal = new Animal();
        a.m1(animal); // Output: Animal version..

        Animal an = outer.new Monkey();
        a.m1(an); // Output: Animal version..
    }
}
