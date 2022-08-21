package value_added_tax_calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Default VAT(value added tax) ratio
        double vat = 0.18;

        // Create price variable
        double price;

        // Create scanner class
        Scanner inp = new Scanner(System.in);

        // Get price from user
        System.out.print("Your price: ");
        price = inp.nextDouble();

        // Calculate vat price
        double vatPrice = price * vat;

        // Calculate total price with vat
        double totalPrice = price + vatPrice;

        // Print the results
        System.out.println("Your value added tax price is: " + vatPrice + " $");
        System.out.println("Your total price with value added tax is: " + totalPrice + " $");

    }
}
