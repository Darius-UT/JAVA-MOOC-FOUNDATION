
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (true) {
            //  Ask the user to give a number
            System.out.println("Give a number:");

            // Exit condition (safe guard)
            if (Integer.parseInt(scanner.nextLine()) == 0) {
                break;
            }

            count += 1;
        }

        System.out.println("Number of numbers: " + count);
    }
}
