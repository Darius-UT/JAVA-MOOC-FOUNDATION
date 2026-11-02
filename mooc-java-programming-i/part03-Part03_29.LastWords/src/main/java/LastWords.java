
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userString = scanner.nextLine();

            if (userString.isEmpty()) {
                return;
            }

            String[] piecesOfString = userString.split(" ");

            System.out.println(piecesOfString[piecesOfString.length - 1]);
        }
    }
}
