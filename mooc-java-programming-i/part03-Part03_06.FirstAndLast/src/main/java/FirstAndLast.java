
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstAndLast {

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

        if (list.size() < 2) {
            System.out.println("The list must have at least 2 elments to retrieve.");
            return;
        }

        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));
    }
}
