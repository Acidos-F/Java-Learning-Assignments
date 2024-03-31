import java.util.*;

public class CodeQualityDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Code Quality Demo!");

        // Input
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        // Output
        System.out.println("Hello, " + name + "! Let's check some code quality issues.");

        // Check if the entered name is too short
        if (name.length() < 3) {
            System.out.println("Warning: Your name seems to be too short. It should be at least 3 characters long.");
        }

        // Call a method with incorrect parameter type
        processNumber(name);

        // Variable declaration outside of its usage scope
        int randomNumber;
        randomNumber = generateRandomNumber();
        System.out.println("Random Number: " + randomNumber);

        // Unused variable
        int unusedVariable = 10;

        // Potential resource leak: Scanner is not closed
        // scanner.close();
    }

    // Method to process a number
    public static void processNumber(String name) {
        int number = 10;
        System.out.println("Processing number: " + number);
    }

    // Method to generate a random number
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
