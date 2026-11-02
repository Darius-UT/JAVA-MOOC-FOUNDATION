
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        if (list.isEmpty()) {
            return;
        }

        System.out.print("Search for? ");
        String requestedString = scanner.nextLine();

        System.out.println(
            requestedString 
            + " was "
            + (list.contains(requestedString) ? "found!" : "not found!")
        );
    }
}
