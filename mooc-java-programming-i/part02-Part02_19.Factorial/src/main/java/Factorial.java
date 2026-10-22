
import java.util.Scanner;

public class Factorial {

    public static long factorial(int num) {
        if (num <= 1) {
            return 1;
        }

        // long result = 1;
        // for (int i = 2; i <= num; i++) {
        // result *= i;
        // }

        // return result;

        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int input = Integer.parseInt(scanner.nextLine());

        if (input < 0) {
            System.out.println(
                    "The number must be greater than or equal to 0.");
            return;
        }

        long factorial = factorial(input);
        System.out.println("Factorial: " + factorial);
    }
}
