package OOPS2;

public class polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("hau hau");
        }
    }

    public static class Cat{
        void speak(){
            System.out.println("miauuu");
        }
    }

    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
     Dog d = new Dog();
     Cat c = new Cat();
     Human h = new Human();

     d.speak();
     c.speak();
     h.speak();
    }
}
