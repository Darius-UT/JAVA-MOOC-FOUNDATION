
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int myFirstNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int mySecondNumber = Integer.parseInt(scanner.nextLine());

        // if (myFirstNumber > mySecondNumber) {
        //     System.out.println("Greater number is: " + myFirstNumber);
        // } else if (myFirstNumber < mySecondNumber) {
        //     System.out.println("Greater number is: " + mySecondNumber);
        // } else {
        //     System.out.println("The numbers are equals!");
        // }
        if (myFirstNumber == mySecondNumber) {
            System.out.println("The numbers are equal!");
            return;
        }

        System.out.println("Greater number is: " + ((myFirstNumber > mySecondNumber) ? myFirstNumber : mySecondNumber));
    }
}
