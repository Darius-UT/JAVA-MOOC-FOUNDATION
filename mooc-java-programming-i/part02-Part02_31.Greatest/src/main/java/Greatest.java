
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int[] myNumberArray = new int[] {number2, number3};

        int greatest = number1;

        for (int i : myNumberArray) {
            if (greatest < i) {
                greatest = i;
            }
        }

        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
