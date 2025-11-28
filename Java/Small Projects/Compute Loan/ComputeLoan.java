import java.util.Scanner;

public class ComputeLoan {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the annual interest rate: ");
		double annualInterestRate = scanner.nextDouble();
		
		// Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		System.out.print("Please enter the number of years as integers: ");
		double numberOfYears = scanner.nextDouble();
		
		System.out.print("Please enter the loan amount: ");
		double loanAmount = scanner.nextDouble();
		
		
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow((1 + monthlyInterestRate), numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);
		
	}
}