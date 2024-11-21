import java.util.Scanner;

public class IT24104344Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        String input = scanner.nextLine(); // Read input as a string

        // Check if input is valid (exactly 5 digits)
        if (input.length() == 5 && input.matches("\\d+")) { // Ensure it’s 5 digits and numeric
            // Print separated digits by space
            for (int i = 0; i < input.length(); i++) {
                System.out.print(input.charAt(i));
                if (i < input.length() - 1) { // Print space after each digit except the last
                    System.out.print(" ");
                }
            }
            System.out.println(); // Print a new line after the output
        } else {
            System.out.println("Please enter a valid five-digit number.");
        }

        scanner.close();
    }
} 