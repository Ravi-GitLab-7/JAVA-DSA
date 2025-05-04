package Conditionals.Practice;

import java.util.Scanner;

public class greatetAreaaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int l = sc.nextInt();
        System.out.println("Enter the breath of rectangle");
        int b = sc.nextInt();

        int perimeter = 2*(l+b);
        int Area = l*b;
        System.out.println("perimeter is: "+perimeter);
        System.out.println("Area is:"+Area);

        if(Area>perimeter)
            System.out.println("Aarea is greter than perimeter: "+(Area-perimeter));

    }
}
