
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int row = 1; row <= size; row++) {
            printSpaces(size - row);
            printStars(row);
        }
    }

    public static void christmasTreeBase(int baseHeight, int baseWidth, int totalTreeHeight) {
        int numberOfLeftSpaces = totalTreeHeight - baseWidth + 1;

        for (int row = 0; row < baseHeight; row++) {
            printSpaces(numberOfLeftSpaces);
            printStars(baseWidth);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int row = 1; row <= height; row++) {
            printSpaces(height - row);
            printStars(2 * row - 1);
        }

        int baseHeight = 2;
        int baseWidth = 3;
        christmasTreeBase(baseHeight, baseWidth, height);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(7);
        System.out.println("---");
        christmasTree(10);
    }
}
