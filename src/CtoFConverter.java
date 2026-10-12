import java.util.Scanner;

public class CtoFConverter {
    static void main(String[] args) {
        double celsius;
        double fahrenheit;
        String trash = "";
        Scanner in = new Scanner(System.in);
        boolean done = false;
        do {
            System.out.print("Input temperature in celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                fahrenheit = (celsius * ((double) 9/5)) + 32;
                System.out.print(celsius + " C is " + fahrenheit + " F");
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You inputted an invalid temperature: " + trash);
                System.out.println("Please enter a valid value!");
            }
        } while(!done);
    }
}
