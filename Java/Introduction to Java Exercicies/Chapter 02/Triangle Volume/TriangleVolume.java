// Write a program that reads in the length of sides of an equilateral triangle and computes the area and volume

import java.util.Scanner;

public class TriangleVolume {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter length of the sides of the Equilateral triangle: ");
		double length = scanner.nextDouble();
		
		double area = Math.sqrt(3) / 4 * Math.pow(length, 2); 
		double volume = area * length;
		
		System.out.printf("Area: %.2f%n", area);
		System.out.printf("Volume: %.2f%n", volume);
	}
}