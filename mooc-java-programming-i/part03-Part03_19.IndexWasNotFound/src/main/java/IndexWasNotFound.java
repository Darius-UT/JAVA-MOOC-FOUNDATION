

import java.util.Scanner;

public class IndexWasNotFound {

    // Method to search for an exact number 
    // return corresponding index in the array (if search successes)
    // return -1 (if search does not success)
    public static int searchInAnArray(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        // Implement the search functionality here
        int indexResult = searchInAnArray(array, searching);
        
        if (indexResult >= 0) {
            System.out.println(searching + " is at index " + indexResult + ".");
        } else {
            System.out.println(searching + " was not found.");
        }

    }

}
