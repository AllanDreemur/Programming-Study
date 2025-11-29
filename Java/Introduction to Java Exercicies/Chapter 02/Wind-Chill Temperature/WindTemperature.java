import java.util.Scanner;

public class WindTemperature {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Fahrenheit between - 58°F and 41°F: ");
		double coreTemperature = scanner.nextDouble();
		
		System.out.print("Enter the wind speed ( >= 2) in miles per hour: ");
		double windSpeed = scanner.nextDouble();
		
		double windTemperature = 35.74 + 0.6215 * coreTemperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * coreTemperature * Math.pow(windSpeed, 0.16);
		
		System.out.print("The wind chill index is: " + windTemperature);
	}
}