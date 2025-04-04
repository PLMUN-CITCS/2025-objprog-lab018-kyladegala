import java.util.Scanner;

public class EvenOddChecker {

    // Method to get an integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean valid = false;

        // Loop to validate input until a valid integer is entered
        while (!valid) {
            try {
                System.out.print("Enter an integer: ");
                number = Integer.parseInt(scanner.nextLine());  // Read user input
                valid = true;  // If input is valid, set valid to true
            } catch (NumberFormatException e) {
                // Handle invalid input (non-integer input)
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        return number;  // Return the valid integer
    }

    // Method to check if a number is even or odd
    public static String checkEvenOrOdd(int number) {
        // Use modulo operator to check if the number is even or odd
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Get an integer input from the user
        int number = getIntegerInput();

        // Check if the number is even or odd and display the result
        String result = checkEvenOrOdd(number);
        System.out.println(result);
    }
}
