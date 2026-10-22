
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = Integer.parseInt(scanner.nextLine());

        if (userInput >= 100) {
            System.out.println("The number must be less than 100.");
            return;
        }

        for (int i = userInput; i <= 100; i++) {
            System.out.println(i);
        }

    }
}
