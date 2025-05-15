package OOPS.Abstract;

abstract class Birds {
    public abstract void fly();
    public abstract void eat();
}

class Sparrow extends Birds {
    public void fly() {
        System.out.println("Sparrow Flying @short height");
    }
    public void eat() {
        System.out.println("Sparrow Eating grains");
    }
}

class Eagle extends Birds {
    public void fly() {
        System.out.println("Eagle Flying @high height");
    }
    public void eat() {
        System.out.println("Eagle Eating carrion");
    }
}

class Crow extends Birds {
    public void fly() {
        System.out.println("Crow Flying @medium height");
    }
    public void eat() {
        System.out.println("Crow Eating grains");
    }
}

class Sky {
    public void allowBirds(Birds ref) {
        ref.fly();
        ref.eat();
        System.out.println();
    }
}

public class New2 {
    public static void main(String[] args) {
        Sky sky = new Sky();
        sky.allowBirds(new Sparrow());
        sky.allowBirds(new Eagle());
        sky.allowBirds(new Crow());
    }
}