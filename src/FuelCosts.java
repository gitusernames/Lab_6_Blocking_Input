import java.util.Scanner;

public class FuelCosts {
    static void main() {
        double tankCapacity = 0.0;
        double milesPerGal = 0.0;
        double pricePerGal = 0.0;
        double hundredMilesCost = 0.0;
        double fullTankDistance = 0.0;
        String trash = "";
        boolean done;
        Scanner in = new Scanner(System.in);
        done = false;
        do {
            System.out.print("Enter the number of gallons of gas your tank can hold: ");
            if (in.hasNextDouble()) {
                tankCapacity = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You said your tank's capacity was: " + trash);
                System.out.println("Please enter a valid value!");
            }
        } while (!done);
        done = false;
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                milesPerGal = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You said your fuel efficiency in miles per gallon was: " + trash);
                System.out.println("Please enter a valid value!");
            }
        } while (!done);
        done = false;
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGal = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You said the price of gas per gallon was: " + trash);
                System.out.println("Please enter a valid value!");
            }
        } while (!done);
        hundredMilesCost = ((double) 100/milesPerGal) * pricePerGal;
        System.out.println("The cost to drive 100 miles is $" + hundredMilesCost);
        fullTankDistance = tankCapacity * milesPerGal;
        System.out.println("The car can travel " + fullTankDistance + " miles with a full tank of gas");
    }
}
