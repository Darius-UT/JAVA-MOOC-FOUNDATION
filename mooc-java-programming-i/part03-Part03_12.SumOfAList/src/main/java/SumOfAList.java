
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // toteuta listan lukujen summan laskeminen tänne

        if (list.size() == 0) {
            System.out.println("Cannot calculate sum because the list is empty.");
            return;
        }

        int sum = 0;
        
        for (int num : list) {
            sum += num;
        }

        System.out.println("Sum: " + sum);
    }
}
