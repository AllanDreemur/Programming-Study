/*Write a program that reads the subtotal and the gratuity rate and then computes the gratuity and total. 
For example, if the user enters 10 for subtotal and 12% for gratuity rate, the program displays $1.2 as gratuity and $11.2 as total. */


import java.util.Scanner;

public class CalculateTips {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = scanner.nextDouble();
		double gratuityRate = scanner.nextDouble();
		
		double tip = subtotal * (gratuityRate / 100);
		double total = subtotal + tip;
		
		System.out.print("The gratuity is $" + tip + " and total is $" + total);
		
	}
}