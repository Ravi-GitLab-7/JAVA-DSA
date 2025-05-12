package OOPS.OVERRIDING;
import org.w3c.dom.ls.LSOutput;
public class test {
    class parent {
        public void property(){
            System.out.println("Land+Cash+Gold");
        }
        public void merry(){
            System.out.println("Raelativegirl...");
        }
    }
    class child extends parent{
        public void merry() {
            System.out.println("Look AnotherGirl..");
        }
    }
    public static void main(String[] args) {
       parent p1 =  new parent();
    }
}
