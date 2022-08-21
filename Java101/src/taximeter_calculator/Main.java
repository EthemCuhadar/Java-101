package taximeter_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pricePerKM = 2.20;
        double defaultPrice = 10;
        double minTotalPrice = 20;
        double distance;

        Scanner inp = new Scanner(System.in);
        System.out.print("Distance(km): ");
        distance = inp.nextDouble();

        double totalPrice = defaultPrice + pricePerKM * distance;
        if (totalPrice < minTotalPrice) {
            totalPrice = minTotalPrice;
        }

        System.out.println("Total price is: " + totalPrice + " $");
    }
}
