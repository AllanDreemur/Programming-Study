// Write a program that prompts the user to enter three points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays its area

import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double x3 = scanner.nextDouble();
		double y3 = scanner.nextDouble();
		
		double distance1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double distance2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double distance3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		
		double semiperimeter = (distance1 + distance2 + distance3) / 2;
		
		double triangleArea = Math.sqrt(semiperimeter * (semiperimeter - distance1) * (semiperimeter - distance2) * (semiperimeter - distance3));
		
		System.out.printf("The area of the triangle is: %.2f", triangleArea);
	}
}