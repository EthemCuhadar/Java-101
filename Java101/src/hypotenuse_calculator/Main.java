package hypotenuse_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double firstLength, secondLength;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter first length: ");
        firstLength = inp.nextDouble();

        System.out.print("Enter second length: ");
        secondLength = inp.nextDouble();

        double hypotenuse = Math.sqrt( (firstLength * firstLength) + (secondLength * secondLength) );
        System.out.println("Hypotenuse length is: " + hypotenuse);
    }
}
