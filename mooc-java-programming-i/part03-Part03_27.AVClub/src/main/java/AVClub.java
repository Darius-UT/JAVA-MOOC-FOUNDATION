
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userString = scanner.nextLine();

            // Stop condition
            if (userString.isEmpty()) {
                return;
            }

            String[] piecesOfString = userString.split(" ");

            for (String piece : piecesOfString) {
                if (piece.contains("av")) {
                    System.out.println(piece);
                }
            }
        }
    }   
}
