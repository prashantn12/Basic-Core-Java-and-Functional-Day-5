package prashant;
import java.util.Scanner;

public class Factor_of_a_number {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        // Input the number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        System.out.println("Factors of " + number + " are:");
	        
	        // Find and print all factors
	        for (int i = 1; i <= number; i++) {
	            if (number % i == 0) {
	                System.out.print(i + " ");
	            }
	        }

	}

}
