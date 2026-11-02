
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";

        int sumOfYear = 0;
        int countOfYear = 0;

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.isEmpty()) {
                break;
            }

            // Process the input
            // Split the input into 2 parts: name + year of birth
            String[] personalDetails = userInput.split(",");
            
            String currentName = personalDetails[0];

            if (currentName.length() > longestName.length()) {
                longestName = currentName;
            }

            // Calculate the sum
            sumOfYear += Integer.parseInt(personalDetails[1]);
            countOfYear++;
        }

        if (countOfYear == 0) {
            return;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double) sumOfYear / countOfYear);
    }
}
