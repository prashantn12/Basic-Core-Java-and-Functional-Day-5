package prashant;
import java.util.Scanner;

public class Prime_Factors_of_a_number {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("Prime factors of " + number + " are:");
        
        // Find and print prime factors
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

	}

}
