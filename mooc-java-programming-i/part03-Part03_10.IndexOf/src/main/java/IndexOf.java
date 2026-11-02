
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number

        System.out.print("Search for? ");
        int userNumber = Integer.parseInt(scanner.nextLine());

        if (list.size() == 0) {
            System.out.println("Cannot find the number because the list is empty.");
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            if (userNumber == list.get(i)) {
                System.out.println(userNumber + " is at index " + i);
            }
        }
    }
}
