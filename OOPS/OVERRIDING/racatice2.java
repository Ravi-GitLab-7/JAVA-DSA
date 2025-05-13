package OOPS.OVERRIDING;
class Doctors{
    public void Operation(){
        System.out.println("Doctor Doing Operation...");
    }
    public void Surgery(){
        System.out.println("Doctor Doing Surgery...");
    }
}
class Nurse extends Doctors{
    public void Operation(){
        System.out.println("Nusres are helping during operation...");
    }
    public void Surgery(){
        System.out.println("Nusres are helping during sergery...");
    }
}
class Patient extends Doctors{
    public void Operation(){
        System.out.println("Patient sleep during operation...");
    }
    public void Surgery(){
        System.out.println("Patient sleep during sergery...");
    }
}
class Hospitals{
    public void allowed(Doctors d){
        d.Operation();
        d.Surgery();
        System.out.println();
    }
}
public class racatice2 {
    public static void main(String[] args) {
       Hospitals h =  new Hospitals();
       h.allowed(new Doctors());
       h.allowed(new Nurse());
       h.allowed(new Patient());
    }
}
