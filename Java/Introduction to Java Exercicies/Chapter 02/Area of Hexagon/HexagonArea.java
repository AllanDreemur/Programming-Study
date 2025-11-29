// Write a program that prompts the user to enter the side of a hexagon and displays its area.

import java.util.Scanner;

public class HexagonArea{
	public static void main(String[] args){
		// Declares a scanner
		Scanner scanner = new Scanner(System.in);
		
		// Asks for user input
		System.out.print("Enter the length of the side: ");
		double hexagonLength = scanner.nextDouble();
		
		double hexagonArea = ((3 * Math.sqrt(3)) / 2) * Math.pow(hexagonLength, 2);
		
		System.out.print("The area of the hexagon is " + hexagonArea);
		
	}
}