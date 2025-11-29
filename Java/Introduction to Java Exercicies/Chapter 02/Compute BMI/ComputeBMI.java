/*Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and
dividing, by the square of your height in meters. Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI. 
Note one pound is 0.45359237 kilograms and one inch is 0.0254 meters.*/

import java.util.Scanner;

public class ComputeBMI {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double userWeight = scanner.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double userHeight = scanner.nextDouble();
		
		double bmi = (userWeight * 0.45359237) / Math.pow((userHeight * 0.0254), 2);
		System.out.print("BMI is " + bmi);
	}
}