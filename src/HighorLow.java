import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    static void main() {
        Random generator = new Random();
        Scanner in = new Scanner(System.in);
        int randNum = generator.nextInt(10) + 1;
        int playerGuess = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("Guess the randomized number from 1 – 10: ");
            if (in.hasNextInt()) {
                playerGuess = in.nextInt();
                in.nextLine();
                if (playerGuess >= 1 && playerGuess <= 10) {
                    done = true;
                } else {
                    System.out.println("You must enter an integer between 1 and 10!");
                }
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid input. Please enter a valid value!");
            }
        } while (!done);
        if (playerGuess == randNum) {
            System.out.println("Right on the money!");
        } else if (playerGuess > randNum) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("Your guess was too low.");
        }
    }
}
