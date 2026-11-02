import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> myList = new ArrayList<>();

        while (true) {
            int userNumber = Integer.parseInt(scanner.nextLine());

            if (userNumber == 0) {
                break;
            }

            myList.add(userNumber);
        }

        if (myList.size() < 3) {
            System.out.println("The list must have at least 3 elements.");
            return;
        }

        System.out.println(myList.get(1) + myList.get(2));
    }
}
