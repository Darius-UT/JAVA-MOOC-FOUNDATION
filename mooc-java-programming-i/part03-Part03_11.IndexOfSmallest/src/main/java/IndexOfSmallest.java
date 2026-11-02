
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> myList = new ArrayList<>();

        while (true) {
            int userInput = Integer.parseInt(scanner.nextLine());

            if (userInput == 9999) {
                break;
            }

            myList.add(userInput);
        }
        
        // safe guard
        if (myList.size() == 0) {
            System.out.println("Cannot find the smallest number because of empty list.");
            return;
        }

        // find the smallest
        int smallest = myList.get(0);
        List<Integer> indexOfSmallestNumbers = new ArrayList<>();
        indexOfSmallestNumbers.add(0);

        for (int i = 1; i < myList.size(); i++) {
            int currentElement = myList.get(i);
            
            if (smallest > currentElement) {
                smallest = currentElement;
                indexOfSmallestNumbers.clear();
                indexOfSmallestNumbers.add(i);
            } else if (smallest == currentElement) {
                indexOfSmallestNumbers.add(i);
            }
        }

        System.out.println("Smallest number: " + smallest);

        for (int element : indexOfSmallestNumbers) {
            System.out.println("Found at index: " + element);
        }
    }
}
