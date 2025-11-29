/* Write a program that converts square meter into ping.
The program prompts the user to enter a number in square meter, converts it to ping,
and displays the result. One square meter is 0.3025 ping.
*/

import java.util.Scanner;

public class SquareMeterToPing{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number in square meter: ");
		double squareMeter = scanner.nextDouble();
		
		double ping = squareMeter * 0.3025;
		
		System.out.print(squareMeter + "² is " + ping + " pings");
	}
}