package Methods;
public class FunctionExamples {

    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public int square(int number) {
        return number * number;
    }

    public static double getAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        FunctionExamples obj = new FunctionExamples();

        obj.greet("Alice");

        int result = obj.square(5);
        System.out.println("Square of 5 is: " + result);

        double avg = getAverage(70, 85, 90);
        System.out.println("Average is: " + avg);
    }
}
