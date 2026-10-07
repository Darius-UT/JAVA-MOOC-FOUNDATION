
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Give a number:");

        int userNumber = Integer.valueOf(myScanner.nextLine());
        System.out.println("You gave the number " + userNumber);
    }
}
