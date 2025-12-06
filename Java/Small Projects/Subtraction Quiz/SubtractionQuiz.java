import java.util.Scanner;

public class SubtractionQuiz {
	public static void main(String[] args) {
		// Declares a scanner
		Scanner scanner = new Scanner(System.in);

		// Defines values to the numbers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		if (number2 > number1) {
			int temp = number1;
			number2 = number1;
			number1 = temp;
		}
		
		int answer = number1 + number2;
		
		// Ask for user input
		System.out.print("What is " + number1 + " + " + number2 + "?");
		int userAnswer = scanner.nextInt();
		
		if (userAnswer == answer) {
			System.out.print("Correct!");
		} else {
			System.out.print("Incorrect. Try again.");
		}
		
	}
}