
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {

    private static final Map<String, String> CREDENTIALS = new HashMap<>(
            Map.of(
                    "alex", "sunshine",
                    "emma", "haskell"));

    private static boolean checkCredentialWhenLogin(String userName, String userPassword) {
        if (userName == null || userPassword == null) {
            return false;
        }

        // Return Password if username exists
        // else return null
        String expectedPassword = CREDENTIALS.get(userName);

        return (expectedPassword != null)
                && (userPassword.equals(expectedPassword));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String userName = scanner.nextLine();

        System.out.println("Enter password: ");
        String userPassword = scanner.nextLine();

        boolean validUser = checkCredentialWhenLogin(userName, userPassword);

        if (validUser) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
