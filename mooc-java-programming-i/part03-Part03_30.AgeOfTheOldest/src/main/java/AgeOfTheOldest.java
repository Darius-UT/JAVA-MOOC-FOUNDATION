
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;

        while (true) {
            String userString = scanner.nextLine();

            if (userString.isEmpty()) {
                break;
            }

            // Process the data
            // Split the string to get Name + Age
            String[] splittedArray = userString.split(",");
            int currentAge = Integer.parseInt(splittedArray[1]);

            if (currentAge > oldestAge) {
                oldestAge = currentAge;
            }
        }

        System.out.println("Age of the oldest: " + oldestAge);
    }
}
