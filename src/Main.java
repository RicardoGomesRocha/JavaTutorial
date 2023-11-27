// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Variables.print();
        arithmeticOperations();
        casting();
    }

    private static void arithmeticOperations() {
        int sum = 3 + 4;
        System.out.println(sum);

        int subtraction = 3 - 2;
        System.out.println(subtraction);

        int multiply = 3 * 4;
        System.out.println(multiply);


        double division = (double)10 / (double)3;
        System.out.println(division);

        int increment = 1;
        increment++;
        System.out.println(increment);

        int decrease = 3;
        decrease--;
        System.out.println(decrease);
    }

    private static void casting() {
        // Implicit casting
        // byte > short > int > long > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        double z = 1.1;
        double p = z + 2;
        System.out.println(p);

        // Explicit casting
        int cas = (int)z + 2;
        System.out.println(cas);

        String string = "1";
        int integer = Integer.parseInt(string);
        System.out.println(integer);

        float floater = Float.parseFloat("1.2");
        System.out.println(floater);
    }
}