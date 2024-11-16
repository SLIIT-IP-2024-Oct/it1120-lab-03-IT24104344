import java.util.Scanner;

public class IT24104344Lab3Q1A {

    public static void main(String[] args) {

	//Declare the variables
	double priceperkg,quantity,totalAmount;

	//create a Scanner object to read input
	Scanner input = new Scanner (System.in);
 	
	//prompt the user to enter the price per kilogram of rice
	System.out.print("Enter the price of 1kg of rice: ");
	priceperkg = input.nextDouble();

	//prompt the user to enter the number of kilograms they want to buy
	System.out.print("Enter the number of kilograms you want to buy: ");
	quantity = input.nextDouble();

	//calcculate the total amount to be paid
	totalAmount = priceperkg * quantity;

	//Display the total amount
	  System.out.println();
	System.out.println("The total amount is: " + totalAmount);

 	}
}

	

 