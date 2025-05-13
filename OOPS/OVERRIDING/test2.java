package OOPS.OVERRIDING;

public class test2 {
    // Inner class Animal
    class Animal {
        public void eat() {
            System.out.println("Animal is eating...");
        }
        public void sleep() {
            System.out.println("Animal is sleeping...");
        }
    }

    // Inner class Monkey
    class Monkey extends Animal {
        public void eat() {
            System.out.println("Monkey is eating...");
        }
        public void sleep() {
            System.out.println("Monkey is sleeping...");
        }
    }

    // Inner class Deer
    class Deer extends Animal {
        public void eat() {
            System.out.println("Deer is eating...");
        }
        public void sleep() {
            System.out.println("Deer is sleeping...");
        }
    }

    // Inner class Lion
    class Lion extends Animal {
        public void eat() {
            System.out.println("Lion hunts and is eating...");
        }
        public void sleep() {
            System.out.println("Lion is sleeping...");
        }
    }

    // Inner class Forest with a method to allow animals
    class Forest {
        public void allowAnimal(Animal animal) { // Fixed method parameter type
            animal.eat();
            animal.sleep();
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        test2 outer = new test2(); // Create an instance of the enclosing class

        // Create an instance of the Forest class
        Forest forest = outer.new Forest();

        // Call allowAnimal() with instances of the inner classes
        forest.allowAnimal(outer.new Monkey());
        forest.allowAnimal(outer.new Deer());
        forest.allowAnimal(outer.new Lion());
    }
}