
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int myFirstNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int mySecondNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int myThirdNumber = Integer.parseInt(scanner.nextLine());

        double myAverageResult = (myFirstNumber + mySecondNumber + myThirdNumber) / 3.0;

        System.out.println("The average is " + myAverageResult);

    }
}
