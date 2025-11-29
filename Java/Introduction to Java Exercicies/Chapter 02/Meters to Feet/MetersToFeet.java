// Write a program that reads a number in meters, converts it to feet, and displays the result. One meter is 3.2786 feet.

import java.util.Scanner;

public class MetersToFeet {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number in feet to be converted to meters: ");
		double feet = scanner.nextDouble();
		
		double meters = feet * 3.2786;
		
		System.out.print(feet + " feet is " + meters + " meters.");
	}
}