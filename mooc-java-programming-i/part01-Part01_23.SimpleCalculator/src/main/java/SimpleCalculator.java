
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        try {
            System.out.println("Give the first number:");
            int myFirstNumber = Integer.parseInt(scanner.nextLine());

            System.out.println("Give the second number:");
            int mySecondNumber = Integer.parseInt(scanner.nextLine());

            int sum = myFirstNumber + mySecondNumber;
            System.out.printf("%1$d + %2$d = %3$d\n", myFirstNumber, mySecondNumber, sum);

            int difference = myFirstNumber - mySecondNumber;
            System.out.printf("%1$d - %2$d = %3$d\n", myFirstNumber, mySecondNumber, difference);

            long product = (long) myFirstNumber * mySecondNumber;
            System.out.printf("%1$d * %2$d = %3$d\n", myFirstNumber, mySecondNumber, product);

            if (mySecondNumber == 0) {
                System.out.println("Divisor (the secondnumber) cannot be 0");
                return;
            }
            double quotient = (double) myFirstNumber / mySecondNumber;
            System.out.printf("%1$d / %2$d = %3$.1f\n", myFirstNumber, mySecondNumber, quotient);
        } catch (NumberFormatException err) {
            System.out.println("An error has occured" + err);
        }

    }
}
