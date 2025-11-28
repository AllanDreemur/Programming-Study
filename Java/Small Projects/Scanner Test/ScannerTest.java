import java.util.Scanner;

public class ScannerTest {

public static void main(String[] args) {

// Declares a constant
final int NUMBER_TWO = 2;

// Displays the constant
System.out.println("Two is " + NUMBER_TWO);

// Declares a variable for the user's number
double number;

// Declares a scanner
Scanner scanner = new Scanner(System.in);

// Ask for the user to input a number
System.out.print("Enter a number of your choice: ");
number = scanner.nextDouble();

// Display the user's number
System.out.println("You typed the number: " + number);

}

}