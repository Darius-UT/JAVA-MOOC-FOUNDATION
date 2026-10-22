

public class Division {

    public static void division (int numerator, int denominator) {
        // safe guard - prvent denominator from being 0 in division
        if (denominator == 0) {
            System.out.println("Denominator should be different from 0.");
            return;
        }

        System.out.println((double) numerator / denominator);
    }

    public static void main(String[] args) {
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        // division(3, 5);
    }
}
