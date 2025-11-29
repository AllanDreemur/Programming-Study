/*Suppose you save $100 each month in a savings account with annual interest rate 3.75%. 
Thus, the monthly interest rate is 0.0375/12 = 0.003125. */

import java.util.Scanner;

public class CompoundValue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the monthly saving amount: ");
		double savingAmount = scanner.nextDouble();
		
		double accountValue1 = savingAmount * (1 + 0.003125);
		double accountValue2 = (savingAmount + accountValue1) * (1 + 0.003125);
		double accountValue3 = (savingAmount + accountValue2) * (1 + 0.003125);
		double accountValue4 = (savingAmount + accountValue3) * (1 + 0.003125);
		double accountValue5 = (savingAmount + accountValue4) * (1 + 0.003125);
		double accountValue6 = (savingAmount + accountValue5) * (1 + 0.003125);
		
		System.out.println("After the first month, the account value is " + accountValue1);
		System.out.println("After the second month, the account value is " + accountValue2);
		System.out.println("After the third month, the account value is " + accountValue3);
		System.out.println("After the sixth month, the account value is " + accountValue6);
		
	}
}