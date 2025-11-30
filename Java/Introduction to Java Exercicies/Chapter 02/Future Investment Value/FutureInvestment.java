/*Write a program that reads in investment amount, annual interest rate, 
and number of years and displays the future investment value*/

import java.util.Scanner;

public class FutureInvestment {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		double amount = scanner.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage: ");
		double monthlyRate = scanner.nextDouble();
		
		System.out.print("Enter number of years: ");
		int years = scanner.nextInt();
		
		double futureValue = amount * (Math.pow(1 + monthlyRate / 1200, years * 12));
		
		System.out.printf("Future value is $%.2f", futureValue);
	}
}