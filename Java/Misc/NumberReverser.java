import java.util.Scanner;

public class NumberReverser {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        int result = 0;
        while(number > 0){
            int lastDigit = number % 10;
            result = result * 10 + lastDigit;
            number = number / 10;
        }

        System.out.println("Reversed number: " + result);
    }
}
