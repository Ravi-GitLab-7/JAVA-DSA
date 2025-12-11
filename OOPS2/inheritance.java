package OOPS2;
class pokeman {   // add static here
    int power;
    String type;
    pokeman(){

    }
//    pokeman() { }
//
//        int getPower{
//            return power;
//        }
    pokeman(String name, int power) {
        this.type = type;
        this.power = power;
    }
    void print() {  //getter
        System.out.println(this.power + " " + this.type);
    }
}
class StrongPockeman extends pokeman{
    int speed;
}
class godPockeman extends StrongPockeman{
    String ability;
}
class legendaryPockeman extends pokeman{
    String ability;
}
public class inheritance {
    public static void main(String[] args) {
        legendaryPockeman mewtwo = new legendaryPockeman();
        mewtwo.ability = "pressure";
        StrongPockeman pikachu = new StrongPockeman();
        pikachu.speed = 200;
        godPockeman avail = new godPockeman();
        avail.ability = "Powewrful";
    }
}
