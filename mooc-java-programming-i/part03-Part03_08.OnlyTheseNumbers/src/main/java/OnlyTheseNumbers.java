
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            numbers.add(number);
        }


        // Process lower bound
        System.out.print("From where? ");
        int lowerBound = Integer.parseInt(scanner.nextLine());

        if (lowerBound < 0) {
            System.out.println("Lower bound should be 0 or above.");
            return;
        }


        // Process upper bound
        System.out.print("To where? ");
        int upperBound = Integer.parseInt(scanner.nextLine());

        if (upperBound >= numbers.size()) {
            System.out.println("Lower bound should be less than the size of the list.");
            return;
        }
        
        System.out.println(numbers.get(lowerBound));
        System.out.println(numbers.get(upperBound));
    }
}
