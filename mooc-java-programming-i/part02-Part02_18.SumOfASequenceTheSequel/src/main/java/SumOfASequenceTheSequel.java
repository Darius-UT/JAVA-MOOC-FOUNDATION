
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Last number? ");
        int second = Integer.parseInt(scanner.nextLine());

        int sum = first;

        for (int i = first + 1; i <= second; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);
    }
}
