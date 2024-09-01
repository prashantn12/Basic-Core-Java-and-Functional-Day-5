package prashant;
import java.util.Scanner;


public class Armstrong_number_in_a_given_range {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        // Get the range from the user
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();
        
        System.out.println("Armstrong numbers between " + lowerBound + " and " + upperBound + " are:");
        
        // Iterate through the range
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

	}
	
	 // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }
        
        return sum == originalNumber;
    }

}
