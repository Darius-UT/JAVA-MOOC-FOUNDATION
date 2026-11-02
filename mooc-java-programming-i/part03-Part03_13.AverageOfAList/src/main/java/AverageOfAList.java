
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> myList = new ArrayList<>();

        while (true) {
            int userInput = Integer.parseInt(scanner.nextLine());

            if (userInput == -1) {
                break;
            }

            myList.add(userInput);
        }

        if (myList.isEmpty()) {
            return;
        }

        int sum = 0;
        for (int num : myList) {
            sum += num;
        }

        double average = (double) sum / myList.size();

        System.out.println("Average: " + average);
    }
}
