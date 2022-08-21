package market_shopping_price_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pearPrice = 2.14;
        double applePrice = 3.67;
        double tomatoPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5.00;

        double pearKG, appleKG, tomatoKG, bananaKG, eggplantKG;

        Scanner inp = new Scanner(System.in);
        System.out.print("How much kg pear do you want: ");
        pearKG = inp.nextDouble();
        System.out.print("How much kg apple do you want: ");
        appleKG = inp.nextDouble();
        System.out.print("How much kg tomato do you want: ");
        tomatoKG = inp.nextDouble();
        System.out.print("How much kg banana do you want: ");
        bananaKG = inp.nextDouble();
        System.out.print("How much kg eggplant do you want: ");
        eggplantKG = inp.nextDouble();

        double pearTotalPrice = pearPrice * pearKG;
        double appleTotalPrice = applePrice * appleKG;
        double tomatoTotalPrice = tomatoPrice * tomatoKG;
        double bananaTotalPrice = bananaPrice * bananaKG;
        double eggplantTotalPrice = eggplantPrice * eggplantKG;

        double totalPrice = pearTotalPrice + appleTotalPrice + tomatoTotalPrice + bananaTotalPrice + eggplantTotalPrice;

        System.out.println("Your total price is: " + totalPrice + " $");
    }
}
