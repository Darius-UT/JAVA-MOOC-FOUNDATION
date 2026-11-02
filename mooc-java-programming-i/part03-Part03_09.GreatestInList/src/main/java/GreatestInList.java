
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreatestInList {

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

        // implement finding the greatest number in the list here
        if (list.size() == 0) {
            System.out.println("Cannot find the greatest number because the list is empty.");
            return;
        }

        int greatest = list.get(0);

        int myListSize = list.size();
        for (int i = 1; i < myListSize; i++) {
            int currentElement = list.get(i);
            if (greatest < currentElement) {
                greatest = currentElement;
            }
        }
        
        System.out.println("The greatest number: " + greatest);
    }
}
