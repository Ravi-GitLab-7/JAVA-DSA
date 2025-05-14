package OOPS.Abstract;

// Exposing the set of services but hiding the internal implementation
abstract class Plane {  // Plane is the class
    public abstract void takeOff();
    public abstract void fly();
    public abstract void land();
}

class CargoPlane extends Plane {  // Class name should start with uppercase by convention
    public void takeOff() {
        System.out.println("CargoPlane Taking off...");
    }

    public void fly() {
        System.out.println("CargoPlane Flying...");
    }

    public void land() {
        System.out.println("CargoPlane Landing...");
    }
}

class FighterPlane extends Plane {
    public void takeOff() {
        System.out.println("FighterPlane Taking off...");
    }

    public void fly() {
        System.out.println("FighterPlane Flying...");
    }

    public void land() {
        System.out.println("FighterPlane Landing...");
    }
}

class Airport {
    public void allowPlane(Plane ref) {
        ref.takeOff();
        ref.fly();
        ref.land();
        System.out.println();
    }
}

public class New {
    public static void main(String[] args) {
        Airport a = new Airport();
        a.allowPlane(new CargoPlane());   // Using CargoPlane instance
        a.allowPlane(new FighterPlane()); // Using FighterPlane instance
    }
}