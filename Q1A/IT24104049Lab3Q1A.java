import java.util.Scanner;

public class IT24104049Lab3Q1A {

	public static void main(String[] arg) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the price of 1kg of rice:");

		double pricePerKg = scanner.nextDouble();

	
		System.out.print("Enter the number of kilograms you want to buy:");

		double quantity = scanner.nextDouble();

		
		double totalamount = pricePerKg * quantity;

		
		System.out.println("The total amount is:" + totalamount);

	
		scanner.close();

	}
}