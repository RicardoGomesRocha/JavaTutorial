import java.util.Scanner;

public class UserInput {
    public static void call() {
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
