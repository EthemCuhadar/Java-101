package perimeter_and_are_calculator_for_circle;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double perimeter, radius, area;

        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle: ");
        radius = inp.nextDouble();

        perimeter = 2.0 * Math.PI * radius;
        area = Math.PI * radius * radius;

        System.out.println("The area of the circle is: " + area + " m^2");
        System.out.println("The perimeter of the circle is: " + perimeter + " m");
    }
}
