package OOPS.OVERRIDING;

public class Aeroplane {
    public void takeOff(){
        System.out.println("Taking off...");
    }
    public void land(){
        System.out.println( "Landing...");
    }
    public void fly(){
        System.out.println("Flying...");
    }

    class passengerPlane extends Aeroplane{
        public void takeOff(){
            System.out.println("Passenger-Plan is Taking off...");
        }
        public void land(){
            System.out.println( "Passenger-Plan is Landing...");
        }
        public void fly(){
            System.out.println("Passenger-Plan is Flying...");
        }
    }
    class cargoPlane extends Aeroplane{
        public void takeOff(){
            System.out.println("Cargo-Plan is Taking off...");
        }
        public void land(){
            System.out.println( "Cargo-Plan is Landing...");
        }
        public void fly(){
            System.out.println("Cargo-Plan is Flying...");
        }
    }
    class fighterPlane extends Aeroplane{
        public void takeOff(){
            System.out.println("Fighter-Plan is Taking off...");
        }
        public void land(){
            System.out.println( "Fighter-Plan is Landing...");
        }
        public void fly(){
            System.out.println( "Fighter-Plan is flying...");
        }
    }

    class airport extends Aeroplane{
        //True Polymorphism
        public void allowAeroplane(Aeroplane ap){
            ap.takeOff();
            ap.fly();
            ap.land();
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Aeroplane outer = new Aeroplane();
//        Aeroplane ap = null;
//        ap = outer.new passengerPlane();
//
//        ap.takeOff();
//        ap.fly();
//        ap.land();
//
//        System.out.println();
//
//        ap = outer.new cargoPlane();
//        ap.takeOff();
//        ap.fly();
//        ap.land();
//
//        System.out.println();
//
//        ap = outer.new fighterPlane();
//        ap.takeOff();
//        ap.fly();
//        ap.land();
        passengerPlane ap = outer.new passengerPlane();
        cargoPlane cp = outer.new cargoPlane();
        fighterPlane fp = outer.new fighterPlane();

        airport a = outer.new airport();
        a. allowAeroplane(ap);
        a. allowAeroplane(cp);
        a. allowAeroplane(fp);
    }
}
