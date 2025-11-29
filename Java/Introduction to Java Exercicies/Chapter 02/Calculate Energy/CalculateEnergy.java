/*Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature. 
Your program should prompt the user to enter the amount of water in kilograms and the initial and final temperatures of the water. */

import java.util.Scanner;

public class CalculateEnergy {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the amount of water in kilograms: ");
		double waterAmount = scanner.nextDouble();
		
		System.out.println("Enter the initial temperature: ");
		double initialTemp = scanner.nextDouble();
		
		System.out.println("Enter the final temperature: ");
		double finalTemp = scanner.nextDouble();
		
		double energyNeeded = waterAmount * (finalTemp - initialTemp) * 4184;
		
		System.out.println("The energy needed is: " + energyNeeded);
	}
}