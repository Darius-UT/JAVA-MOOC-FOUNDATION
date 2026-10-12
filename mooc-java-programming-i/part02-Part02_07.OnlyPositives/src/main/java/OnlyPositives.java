
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Ask the user to give a number
            System.out.println("Give a number:");

            // Read user input and parse as an integer.
            int userNumber = Integer.parseInt(scanner.nextLine());

            // If user's number is equal 0 -> exit loop
            if (userNumber == 0) {
                break;
            }

            // If user's number is negative (< 0) -> print "Unsuitable number" + pass current iteration + next iteration
            if (userNumber < 0) {
                System.out.println("Unsuitable number");
                continue;
            }

            // If user's number is positive (> 0) -> print the power of two.
            long powerOfTwo = (long) userNumber * userNumber;
            System.out.println(powerOfTwo);
        }

    }
}
