import java.util.Scanner;

public class SimpleIfDemo{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		
		int userInput = scanner.nextInt();
		
		if (userInput % 5 == 0) {
			System.out.print(userInput + " is multiple of 5!");
			
		} else {
			System.out.print(userInput + " is not multiple of 5!");
		}
	}
}