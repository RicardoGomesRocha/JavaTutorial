import java.awt.*;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        variables();
        referenceType();
        strings();
        specialChars();
    }

    private static void specialChars() {
        String message = "Hello \"Mosh\"";
        System.out.println(message);
        String path = "c:\\Windows\\abc\\ee";
        System.out.println(path);
        String enterMessage = "c:\nWindows\nabc\nee";
        System.out.println(enterMessage);
        String tabMessage = "c:\tWindows\tabc\tee";
        System.out.println(enterMessage);
    }

    private static void strings() {
        String message = "  Hello World" + "!!  ";
        System.out.println(message);
        System.out.println(message.startsWith("!!"));
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("Wo"));
        // This not modify the original String
        // Strings are immutable
        System.out.println(message.replace("Hello", "HELLO"));
        System.out.println(message);
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }

    private static void referenceType() {
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        point2.y = 3;
        System.out.println(point1);
        System.out.println(point2);
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