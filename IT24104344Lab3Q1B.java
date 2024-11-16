import java.util.Scanner;

public class IT24104344Lab3Q1B {
    public static void main(String[] args) { // Correct main method signature
        Scanner scanner = new Scanner(System.in);

        // Prompt for the price of 1 kg of rice
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKG = scanner.nextDouble();

        // Prompt for the number of kilograms
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = scanner.nextDouble();

        // Calculate the total amount before discount
        double totalAmount = pricePerKG * kilograms;

        // Calculate the discount
        double discount = totalAmount * 0.10; // 10% discount
        double amountAfterDiscount = totalAmount - discount;

        // Display the total amount after discount
        System.out.printf("Total amount before discount: %.2f%n", totalAmount);
        System.out.printf("Discount: %.2f%n", discount);
        System.out.printf("The total amount to pay after discount is: %.2f%n", amountAfterDiscount);

        // Close the scanner
        scanner.close();
    }
}