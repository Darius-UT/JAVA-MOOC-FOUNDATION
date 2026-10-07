
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "I will tell you a story, but I need some information first.\n"
                        + "What is the main character called?");
        String characterName = String.valueOf(scanner.nextLine());

        System.out.println("What is their job?");
        String characterJob = String.valueOf(scanner.nextLine());

        System.out.println(
                String.format(
                        "Here is the story:\n"
                                + "Once upon a time there was %1$s, who was %2$s.\n"
                                + "On the way to work, %1$s reflected on life.\n"
                                + "Perhaps %1$s will not be %2$s forever.",
                        characterName,
                        characterJob));
    }
}
