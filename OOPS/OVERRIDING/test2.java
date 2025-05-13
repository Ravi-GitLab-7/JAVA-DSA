package OOPS.OVERRIDING;

public class test2 {
    class Animal {
        public void eat() {
            System.out.println("Animal is eating...");
        }
        public void sleep() {
            System.out.println("Animal is sleeping...");
        }
    }
    class Monkey extends Animal {
        public void eat() {
            System.out.println("Monkey is eating...");
        }
        public void sleep() {
            System.out.println("Monkey is sleeping...");
        }
    }
    class Deer extends Animal {
        public void eat() {
            System.out.println("Deer is eating...");
        }
        public void sleep() {
            System.out.println("Deer is sleeping...");
        }
    }
    class Lion extends Animal {
        public void eat() {
            System.out.println("Lion hunts and is eating...");
        }
        public void sleep() {
            System.out.println("Lion is sleeping...");
        }
    }

    public static void main(String[] args) {
        test2 outer = new test2(); // Create an instance of the enclosing class

        Animal a = null;

        // Create instances of inner classes via the 'outer' instance
        a = outer.new Monkey();
        a.eat();
        a.sleep();

        System.out.println();
        a = outer.new Deer();
        a.eat();
        a.sleep();

        System.out.println();
        a = outer.new Lion();
        a.eat();
        a.sleep();
    }
}