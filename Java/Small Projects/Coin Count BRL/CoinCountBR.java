import java.util.Scanner;

public class CoinCountBR {
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
		
		// Pennies of 0,01 BRL 
		int totalPennies = moneyBeforeComma * 100 + moneyAfterComma;
		
		// Pennies of 0,05 BRL
		int penny5 = totalPennies / 5;
		
		// Pennies of 0,10 BRL
		int penny10 = totalPennies / 10;
		
		// Pennies of 0,25 BRL
		int penny25 = totalPennies / 25;
		
		// Pennies of 0,50 BRL
		int penny50 = totalPennies / 50;
		
		System.out.println("The amount of money R$" + userInputMoney + " have:");
		System.out.println("Pennies of 0,01 BRL: R$" + totalPennies);
		System.out.println("Pennies of 0,05 BRL: R$" + penny5);
		System.out.println("Pennies of 0,10 BRL: R$" + penny10);
		System.out.println("Pennies of 0,25 BRL: R$" + penny25);
		System.out.print("Pennies of 0,50 BRL: R$" + penny50);
	
	}
}