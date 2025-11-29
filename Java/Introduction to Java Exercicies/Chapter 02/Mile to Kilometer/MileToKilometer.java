// Write a program that reads a mile in a double value from the console, converts it to kilometers, and displays the result. 

import java.util.Scanner;

public class MileToKilometer{
	public static void main(String[] args) {
		
		// Declares a scanner
		Scanner scanner = new Scanner(System.in);
		
		// Asks the user for input
		System.out.print("Enter the value in miles to be converted to kilometers: ");
		double miles = scanner.nextDouble();
		
		// Convert miles to kilometers
		double kilometers = miles * 1.6;
		
		// Display the conversion
		System.out.print(miles + " miles is " + kilometers + " kilometers.");
		
	}
}