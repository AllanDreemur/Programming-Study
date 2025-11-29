import java.util.Scanner;

public class CurrentTime{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		// Storages the total time from 1970 till now in miliseconds
		long totalMiliseconds = System.currentTimeMillis();
		
		// Filter the total seconds to get the current seconds
		long totalSeconds = totalMiliseconds / 1000;
		long currentSeconds = totalSeconds % 60;
		
		// Filter the total minutes to get the current minutes
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		
		// Filter the total hours to get the current hours
		long totalHours = totalMinutes / 60;
		long currentHours = totalHours % 24;
		
		System.out.print("Enter the time zone offset to GMT: ");
		int offSet = scanner.nextInt();
		
		System.out.print("Now is " + (currentHours + offSet) + ":" + currentMinutes + ":" + currentSeconds + " GMT");
		
	}
}