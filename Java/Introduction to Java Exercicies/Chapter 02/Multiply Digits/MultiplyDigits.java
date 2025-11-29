// Write a program that reads an integer between 0 and 1000 and multiplies all the digits in the integer.

import java.util.Scanner;

public class MultiplyDigits{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an integer number between 0 and 1000: ");
		int userNumber = scanner.nextInt();
		
		// Get the first digit of the number
		int firstDigit = userNumber % 10;
		userNumber = userNumber / 10;
		
		// Get the second digit
		int secondDigit = userNumber % 10;
		userNumber = userNumber / 10;
		
		// Get the third digit
		int thirdDigit = userNumber;
		
		int total = firstDigit * secondDigit * thirdDigit;
		
		System.out.print(firstDigit + " * " + secondDigit + " * " + thirdDigit + " = " + total);
		
	}
}