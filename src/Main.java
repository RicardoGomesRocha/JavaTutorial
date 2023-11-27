import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        variables();
        referenceType();
        strings();
        specialChars();
        arrays();
        matrix();
        consts();

    }

    private static void consts() {
        // constants should be upper case
        final float PI = 3.14F;
        System.out.println(PI);
    }

    private static void matrix() {
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));

        int[][][] numbers3D = new int[2][3][4];
        numbers3D[0][0][0] = 1;
        System.out.println(Arrays.deepToString(numbers3D));

        int [][] matrix = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(matrix));
    }

    private static void arrays() {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        int[] anotherNumbers = {2,3,5,1,3};
        System.out.println(Arrays.toString((anotherNumbers)));
        Arrays.sort(anotherNumbers);
        System.out.println(Arrays.toString((anotherNumbers)));
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