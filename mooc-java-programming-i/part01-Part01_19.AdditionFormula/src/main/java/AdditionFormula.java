
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
        int myFirstNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int mySecondNumber = Integer.parseInt(scanner.nextLine());

        int mySumResult = myFirstNumber + mySecondNumber;

        System.out.printf("%1$d + %2$d = %3$d", myFirstNumber, mySecondNumber, mySumResult);
    }
}
