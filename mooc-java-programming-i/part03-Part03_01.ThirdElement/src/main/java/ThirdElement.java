
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> myList = new ArrayList<>();

        while (true) {
            String myString = scanner.nextLine();

            // safe guard - termination condition: end when user enters empty string
            if (myString.equals("")) {
                break;
            }

            myList.add(myString);
        }

        // Ensure the list has 3rd element (at index 2)
        if (myList.size() < 3) {
            System.out.println("This exercise need at least 3 elements in the list.");
            return;
        }

        System.out.println(myList.get(2));
    }
}
