package average_note_calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create variables
        int math, phy, chem, hist, bio;

        // Create scanner class
        Scanner inp = new Scanner(System.in);

        // Get variables from user
        System.out.print("Math note: ");
        math = inp.nextInt();
        System.out.print("Phy note: ");
        phy = inp.nextInt();
        System.out.print("Chem note: ");
        chem = inp.nextInt();
        System.out.print("Hist note: ");
        hist = inp.nextInt();
        System.out.print("Bio note: ");
        bio = inp.nextInt();

        // Calculate average
        double avg = (math + phy + chem + hist + bio) / 5.0;

        // Result
        System.out.println("Your note average is: " + avg);
    }
}
