package OOPS.Instance;
// Public Static final
interface IDemo  //interface name
{
    int x = 10;
}
public class test1 implements IDemo{
    public static void main(String[] args) {
        int x =100; //local variable
        System.out.println(x);  //in which more priority of local than static
        System.out.println(IDemo.x);  //using interface name
    }
}
