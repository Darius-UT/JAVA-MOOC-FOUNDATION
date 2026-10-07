
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int myFirstNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int mySecondNumber = Integer.parseInt(scanner.nextLine());

        double myAverageResult = (myFirstNumber + mySecondNumber) / 2.0;

        System.out.println("The average is " + myAverageResult);

    }
}
