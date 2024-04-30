import java.util.Scanner;

public class literconverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, world!");

        System.out.println("Converting liters to gallons in increments of 4...");

        for (int lit = 4; lit <= 400; lit += 4) {
            double gal = lit / 3.79;
            System.out.println(lit + " liters is approximately equal to " + gal + " gallons");
        }

        System.out.println("Liters to Gallons Conversion All Done!");
        scanner.close();
    }
}