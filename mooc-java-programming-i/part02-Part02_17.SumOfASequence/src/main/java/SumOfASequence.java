
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number? ");
        int higherBound = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        if (higherBound < 1) {
            System.out.println("higherBound must be greater than 0");
            return;
        }

        for (int i = 1; i <= higherBound; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);
    }
}
