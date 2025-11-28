import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args){
		
		// Declares a scanner
		Scanner scanner = new Scanner(System.in);
		
		// Ask the user to type a number
		System.out.println("Welcome! I can easily check if your number is odd or even.");
		System.out.print("Type your number: ");
		
		// Storage the number user typed
		int userNumber = scanner.nextInt();
		
		// Checks if the user number is odd or even
		if (userNumber % 2 == 0) {
			System.out.print("The number " + userNumber + " is an odd number!");
			
		} else {
			System.out.print("The number " + userNumber + " is an even number!");
		}
		
		
	}
}