import java.util.Scanner;   
public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPositiveNumbers = 0;
        int sumPositiveNumber = 0;

        while (true) {
            // Read use's input and assign it to a variable
            int userInput = Integer.parseInt(scanner.nextLine());

            // exit condition
            if (userInput == 0) {
                break;
            }

            // execution condition
            if (userInput > 0) {
                countPositiveNumbers++;
                sumPositiveNumber += userInput;
            }
        }

        if (countPositiveNumbers == 0) {
            System.out.println("Cannot calculate the average");
            return;
        }

        double average = (double) sumPositiveNumber / countPositiveNumbers;
        System.out.println(average);
    }
}
