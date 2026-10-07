
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Write a message:");

        String myString = String.valueOf(myScanner.nextLine());

        System.out.println(myString);
    }
}
