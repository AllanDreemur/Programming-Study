import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		
		// Declares a scanner
		Scanner scanner = new Scanner(System.in);
		
		// Ask for an input from user
		System.out.print("Fahrenheit to Celsius conveter! Please type the value of ºF to be converted: ");
		
		// Storage the value
		float fahrenheit = scanner.nextFloat();
		
		// ºF to ºC formula
		float celsius = (fahrenheit - 32F) / 1.8F;
		
		// Display the conversion
		System.out.print(fahrenheit + "ºF is the same as " + celsius + "ºC!");
		
	}
}