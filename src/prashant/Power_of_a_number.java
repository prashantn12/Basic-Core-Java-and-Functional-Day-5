package prashant;
import java.util.Scanner;

public class Power_of_a_number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        // Input base and exponent
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        
        int result = 1;
        
        // Calculate power using a loop
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        
        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

	}

}
