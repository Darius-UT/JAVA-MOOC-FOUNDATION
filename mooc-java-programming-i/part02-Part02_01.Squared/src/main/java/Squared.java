
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = Integer.parseInt(scanner.nextLine());
        
        long result = userInput * userInput;

        System.out.println(result);
    }
}
