import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        variables();
    }

    private static void variables() {
        int myAge = 30;
        int hearAge = myAge;
        System.out.println(hearAge);
        long longNumber = 123_456_123L;
        System.out.println(longNumber);
        float price = 10.99F;
        System.out.println(price);
        char letter = 'A';
        System.out.println(letter);
        boolean isEligible = true;
        System.out.println(isEligible);
        Date now = new Date();
        System.out.println(now);
    }
}