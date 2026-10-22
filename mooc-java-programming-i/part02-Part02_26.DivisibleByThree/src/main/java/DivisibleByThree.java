
import java.util.Scanner;

public class DivisibleByThree {

    public static void divisibleByThreeInRange (int lower, int upper) {
        for (int i = lower; i <= upper; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    }

}
