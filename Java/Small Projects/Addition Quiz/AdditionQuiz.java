import java.util.Scanner;

public class AdditionQuiz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double number1 = System.currentTimeMillis() % 10;
		double number2 = System.currentTimeMillis() / 10 % 10;
		double correctNumber = number1 + number2;
		
		System.out.print("Enter the answer between the addition of " + number1 + " and " +number2 + ": ");
		double userAnswer = scanner.nextDouble();
		
		if (userAnswer == correctNumber) {
			System.out.print("Congratulations! You've answered correctly.");
			
		} else {
			System.out.print("Wrong answer. Try again!");
		}
	}
}