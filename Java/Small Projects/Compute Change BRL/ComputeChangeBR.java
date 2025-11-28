import java.util.Scanner;

public class ComputeChangeBR {
	public static void main(String[] args){
		
		//Declares a scanner
		Scanner scanner = new Scanner(System.in);
		
		// Asks for user input
		System.out.print("Enter the amount of money in BRL: ");
		double userInputMoney = scanner.nextDouble();
		
		// Gets the amount of money before the comma
		int moneyBeforeComma = (int)userInputMoney;
		
		// Gets the amount of money after the comma
		int moneyAfterComma = (int)((userInputMoney - (double)moneyBeforeComma) * 100);
		
		// Total Pennies of 0,01 BRL 
		int totalPennies = moneyBeforeComma * 100 + moneyAfterComma;
		int remainingPennies = totalPennies;
		
		// Total Pennies of 1,00 BRL
		int penny100 = totalPennies / 100;
		remainingPennies = remainingPennies % 100;
		
		// Total Pennies of 0,50 BRL
		int penny50 = remainingPennies / 50;
		remainingPennies = remainingPennies % 50;
		
		// Total Pennies of 0,25 BRL
		int penny25 = remainingPennies / 25;
		remainingPennies = remainingPennies % 25;
		
		// Total Pennies of 0,10 BRL
		int penny10 = remainingPennies / 10;
		remainingPennies = remainingPennies % 10;
		
		// Total Pennies of 0,05 BRL
		int penny5 = remainingPennies / 5;
		remainingPennies = remainingPennies % 5;
		
		int penny1 = remainingPennies;
		
		System.out.println("Your amount consists of: ");
		System.out.println("1,00 pennies: " + penny100);
		System.out.println("0,50 pennies: " + penny50);
		System.out.println("0,25 pennies: " + penny25);
		System.out.println("0,10 pennies: " + penny10);
		System.out.println("0,05 pennies: " + penny5);
		System.out.print("0,01 pennies: " + penny1);
	
	}
}