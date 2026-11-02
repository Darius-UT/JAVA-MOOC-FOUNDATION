
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> myList = new ArrayList<>();

        while (true) {
            int userNumber = Integer.parseInt(scanner.nextLine());

            if (userNumber == -1) {
                break;
            }

            myList.add(userNumber);
        }

        for (int element : myList) {
            System.out.println(element);
        }

    }
}
