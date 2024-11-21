import java.util.Scanner;

public class IT24104344Lab3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Monthly salary
        System.out.print("Enter the monthly salary: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a numeric value.");
            return;
        }
        double monthlySalary = scanner.nextDouble();

        // Number of OT hours
        System.out.print("Enter the number of OT hours: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a numeric value.");
            return;
        }
        double otHours = scanner.nextDouble();

        // OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a numeric value.");
            return;
        }
        double otHourlyRate = scanner.nextDouble();

        // Calculate OT amount
        double otAmount = otHours * otHourlyRate;

        // Calculate total salary
        double totalSalary = monthlySalary + otAmount;

        // Display the results
        System.out.printf("Monthly Salary: %.2f\n", monthlySalary);
        System.out.printf("OT Amount: %.2f\n", otAmount);
        System.out.printf("Total Salary: %.2f\n", totalSalary);

        // Close the scanner
        scanner.close();
    }
}