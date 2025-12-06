import java.util.Scanner;

public class ComputeIBM {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your weight in inches and your height in pounds: ");
		double userWeight = scanner.nextDouble() * 0.45359237;
		double userHeight = scanner.nextDouble() * 0.0254;
		
		double userIBM = userWeight / Math.pow(userHeight, 2);
		
		System.out.println("IBM is " + userIBM);
		
		if (userIBM >= 30.0) {
			System.out.println("Obese.");
		} else if (userIBM < 30.0 && userIBM >= 25.0) {
			System.out.println("Overweight.");
		} else if (userIBM < 25.0 && userIBM >= 18.5) {
			System.out.println("Normal.");
		} else {
			System.out.println("Underweight.");
		}
		
	}
}