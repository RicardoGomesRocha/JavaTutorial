import java.text.NumberFormat;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Variables.print();
        // AdvanceConcepts.print();
        userInput();
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age + " years old");
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("Your are: " + name);
    }
}