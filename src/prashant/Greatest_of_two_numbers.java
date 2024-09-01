package prashant;
import java.util.Scanner;

public class Greatest_of_two_numbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Determine the greater number
        int greatest = (num1 > num2) ? num1 : num2;

        // Output the result
        System.out.println("The greatest number is: " + greatest);

	}

}
