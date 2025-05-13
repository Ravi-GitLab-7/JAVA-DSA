package OOPS.OVERRIDING;

class Teachers{
    public void read(){
        System.out.println("Teacher is reading...");
    }
    public void sleep(){
        System.out.println("Teacher is sleeping...");
    }
}
class Students extends Teachers{
    public void read(){
        System.out.println("Students is reading...");
    }
    public void sleep(){
        System.out.println("Students is sleeping...");
    }
}

class Schools{
    //polymorphism
    public void allowTeachers(Teachers t){
         t.read();
         t.sleep();
        System.out.println();
    }
}
public class Practice {
    public static void main(String[] args) {
       Schools s = new Schools();
       s.allowTeachers(new Teachers());
       s.allowTeachers(new Students());
    }
}
