package body_mass_index_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double weight, height;

        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter your weight in kg: ");
        weight = inp.nextDouble();
        System.out.print("Please enter your height in cm: ");
        height = inp.nextDouble();

        double index = weight / ( (height / 100.0) * (height / 100.0) );
        System.out.println("Your body mass index is: " + index);
    }
}
