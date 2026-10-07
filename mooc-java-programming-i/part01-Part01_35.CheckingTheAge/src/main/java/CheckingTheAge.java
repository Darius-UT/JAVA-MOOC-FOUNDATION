
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int userAge = Integer.parseInt(scan.nextLine());

        if (userAge < 0 || userAge > 120) {
            System.out.println("Impossible!");
            return;
        }

        System.out.println("OK");
    }
}
