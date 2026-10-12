import java.util.Scanner;

public class RectangleInfo {
    static void main() {
        double width = 0;
        double height = 0;
        double area;
        double perimeter;
        double hypotenuse;
        String trash;
        boolean done = false;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter the rectangle's width: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid value!");
            }
        } while (!done);
        done = false;
        do {
            System.out.print("Enter the rectangle's height: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid value!");
            }
        } while (!done);
        area = width * height;
        perimeter = (2.0 * width) + (2.0 * height);
        System.out.println("The area of the rectangle is " + area + " and the perimeter is " + perimeter);
        hypotenuse = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        System.out.println("The length of the diagonal is " + hypotenuse);
    }
}
