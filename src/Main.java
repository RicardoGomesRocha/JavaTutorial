// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Variables.print();
        arithmeticOperations();
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
}