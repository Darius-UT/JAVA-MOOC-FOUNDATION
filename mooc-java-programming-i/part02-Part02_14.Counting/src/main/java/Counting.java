
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int higherBound = Integer.parseInt(scanner.nextLine());

        if (higherBound <= 0) {
            System.out.println("Higher bound must be greater than 0.");
            return;
        }

        for (int i = 0; i <= higherBound; i++) {
            System.out.println(i);
        }
    }
}
