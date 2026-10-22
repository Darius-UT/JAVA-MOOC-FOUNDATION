
import java.util.Scanner;
import java.lang.Math;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long sum = firstNumber + secondNumber;

        if (sum < 0) {
            System.out.println("Sum must be larger than 0");
            return;
        }

        double squareRootResult = Math.sqrt(sum);
        
        System.out.println(squareRootResult);
    }
}
