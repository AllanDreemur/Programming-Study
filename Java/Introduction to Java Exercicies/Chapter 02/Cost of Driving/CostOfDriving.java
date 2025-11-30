/*Write a program that prompts the user to enter the distance to drive,
 the fuel efficiency of the car in miles per gallon,
 and the price per gallon then displays the cost of the trip.*/

import java.util.Scanner;

public class CostOfDriving {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the distance to drive: ");
		double distance = scanner.nextDouble();
		
		System.out.print("Enter the fuel efficiency of the car in miles per gallon: ");
		double efficiency = scanner.nextDouble();
		
		System.out.print("Enter the price per gallon: ");
		double priceGallon = scanner.nextDouble();
		
		double tripCost = (distance / efficiency) * priceGallon;
		
		System.out.printf("Cost of the trip: $%.2f", tripCost);
	}
}