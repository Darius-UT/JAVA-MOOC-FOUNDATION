
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Write a message:");

        String userString = String.valueOf(myScanner.nextLine());

        for (int i = 0; i < 3; i++) {
            System.out.println(userString);
        }

    }
}
