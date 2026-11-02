
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        String nameOfTheOldest = null;

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
                nameOfTheOldest = splittedArray[0];
            }
        }

        System.out.println("Name of the oldest: " + nameOfTheOldest);
    }
}
