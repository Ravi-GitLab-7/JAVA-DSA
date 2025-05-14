package OOPS.Abstract;

class Plane{
    public void takeOff(){

    }
    public void fly(){

    }
    public void land(){

    }
}
class cargoPlane extends Plane{
    public void takeOff(){
        System.out.println( " cargoPlane  Taking off...");

    }
    public void fly(){
        System.out.println( " cargoPlane  Flying...");
    }
    public void land(){
        System.out.println(" cargoPlane  Landing...");
    }
}
class fighterPlane extends Plane{
    public void takeOff(){
        System.out.println( " fighterPlane  Taking off...");
    }
    public void fly(){
        System.out.println(" fighterPlane  Flying...");
    }
    public void land(){
        System.out.println(" cargoPlane  Landing...");
    }
}
public class New {
    public static void main(String[] args) {
            new Plane();
    }
}
