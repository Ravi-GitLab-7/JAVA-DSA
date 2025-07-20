package String;
public class stringBuilderFunction {
    public static void main(String[] args) {

        //function
        StringBuilder sb = new StringBuilder("Ravi");
        StringBuilder tb = new StringBuilder("Riya");
        System.out.println(sb.append(tb));
        System.out.println(sb.compareTo(tb));
        System.out.println(sb.reverse());
        System.out.println(tb.reverse());
    }
}
