
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int userNumber = Integer.parseInt(scan.nextLine());

        boolean isEven = (userNumber % 2 == 0);

        if (isEven) {
            System.out.printf("Number %d is even.\n", userNumber);
        } else {
            System.out.printf("Number %d is odd.\n", userNumber);
        }
    }
}
