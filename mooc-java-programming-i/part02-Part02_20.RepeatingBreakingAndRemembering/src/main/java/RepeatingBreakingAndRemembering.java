
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        int evenCount = 0;

        while (true) {
            System.out.println("Give numbers:");
            int userInput = Integer.parseInt(scanner.nextLine());

            if (userInput == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            
            // Update Sum + Count
            sum += userInput;
            count++;

            // Update number of even numbers
            if (userInput % 2 == 0) {
                evenCount++;
            }
        }

        // Print sum
        System.out.println("Sum: " + sum);

        // Print numbers:
        System.out.println("Numbers: " + count);

        // Print average
        if (count == 0) {
            System.out.println("Count must be greater than 0");
            return;
        }
        double average = (double) sum / count;
        System.out.println("Average: " + average);

        // Print even;
        System.out.println("Even: " + evenCount);

        // Print odd;
        System.out.println("Odd: " + (count - evenCount));
    }
}
