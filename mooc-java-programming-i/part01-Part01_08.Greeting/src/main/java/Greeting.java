
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What's your name?");

        String userName = String.valueOf(myScanner.nextLine());

        System.out.println("Hi " + userName);

    }
}
