import java.util.Scanner;

public class DisplayTime {
	public static void main(String[] args) {
		// Declares a scanner
		Scanner scanner = new Scanner(System.in);
		
		// Ask input from the user
		System.out.println("Time converter from seconds to minutes and seconds!");
		System.out.print("Insert an amount of time in seconds: ");
		
		// Storage the user input
		int userNumber = scanner.nextInt();
		
		// Declares variables for minutes and seconds
		int minutes = userNumber / 60;
		int seconds = userNumber % 60;
		
		// Display the time in minutes and seconds
		System.out.print("The number " + userNumber + " have " + minutes + " minutes and " + seconds + " seconds!");
		
		
	}
}