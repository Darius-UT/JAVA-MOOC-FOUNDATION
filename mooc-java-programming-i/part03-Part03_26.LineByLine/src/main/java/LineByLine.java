
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userString = scanner.nextLine();

            if (userString.isEmpty()) {
                return;
            }

            String[] splittedArray = userString.split(" ");

            for (String element : splittedArray) {
                System.out.println(element);
            }
        }

    }
}
